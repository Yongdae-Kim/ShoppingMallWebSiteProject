package com.jejuuniv.smp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = "/myProductList")
public class MyProductListController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView myProductList(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			List<Product> list = productService.myProductList(loginUser
					.getName());
			modelAndView.addObject("productList", list);
			viewName = "myProductList";
		} else {
			viewName = "redirect:userLogin";
		}
		modelAndView.setViewName(viewName);

		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView myProductListForm(
			@RequestParam("productId") long productId, HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			productService.removeProduct(productId);
			List<Product> list = productService.myProductList(loginUser
					.getName());
			modelAndView.addObject("productList", list);
			viewName = "myProductList";
		} else {
			viewName = "redirect:userLogin";
		}
		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
