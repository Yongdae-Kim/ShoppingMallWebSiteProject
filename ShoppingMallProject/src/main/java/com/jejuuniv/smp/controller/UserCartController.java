package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.cart.CartService;

@Controller
public class UserCartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(value = "/userCart", method = RequestMethod.GET)
	public ModelAndView userCart(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			modelAndView.addObject("cartList",
					cartService.findProducts(loginUser.getName()));
			viewName = "userCart";
		} else {
			viewName = "redirect:userLogin";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product,
			HttpSession session, RedirectAttributes redirectAttributes) {

		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			String userName = loginUser.getName();
			long productId = product.getId();

			if (!cartService.isExistedProduct(userName, productId)) {
				cartService.addProduct(userName, productId);
			} else {
				redirectAttributes.addFlashAttribute("msg",
						"The product has already been registered.");
			}
			viewName = "redirect:userCart";
		} else {
			viewName = "redirect:userLogin";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
