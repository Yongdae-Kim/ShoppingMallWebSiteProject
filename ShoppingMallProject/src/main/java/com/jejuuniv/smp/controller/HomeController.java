package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = { "/", "/welcome**" })
public class HomeController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
//		Product product = productService.getLatestProduct();
//		modelAndView.addObject("product", product);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
