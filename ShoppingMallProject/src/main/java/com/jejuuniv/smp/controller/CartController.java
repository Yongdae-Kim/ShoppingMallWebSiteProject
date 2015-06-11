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
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView cart(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			modelAndView.addObject("cartList",
					cartService.findProducts(loginUser.getName()));
			viewName = "cart";
		} else {
			viewName = "redirect:login";
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
			String msg = "";

			if (!cartService.isExistedProduct(userName, productId)) {
				cartService.addProduct(userName, productId);
				msg = "If you want to buy a product, Click the 'Buy' button.";

			} else {
				msg = "The product has already been registered.";
			}
			redirectAttributes.addFlashAttribute("msg", msg);
			viewName = "redirect:cart";
		} else {
			viewName = "redirect:login";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
