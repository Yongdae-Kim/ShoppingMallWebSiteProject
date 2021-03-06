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
import com.jejuuniv.smp.service.product.ProductService;

@RequestMapping(value = "/productRegister")
@Controller
public class ProductRegisterController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productRegister(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			viewName = "productRegister";
		} else {
			viewName = "redirect:userLogin";
		}
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView productRegisteForm(@ModelAttribute Product product,
			HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		productService.registeProduct(product, session);
		modelAndView.setViewName("redirect:productList");
		return modelAndView;
	}
}
