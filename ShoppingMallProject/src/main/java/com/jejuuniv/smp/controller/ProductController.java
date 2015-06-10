package com.jejuuniv.smp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView product(@ModelAttribute Product product) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("product", product);
		modelAndView.setViewName("product");
		return modelAndView;
	}
}
