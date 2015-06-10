package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
			HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			// 중복되는 상품 등록 시 예외처리 필요
			System.out.println(loginUser.getName());
			System.out.println(cartService.isExistedProduct(product.getId()));
			// cartService.addProduct(loginUser.getName(), product.getId());
			viewName = "redirect:cart";
		} else {
			viewName = "redirect:login";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
