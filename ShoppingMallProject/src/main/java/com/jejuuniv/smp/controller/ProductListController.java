package com.jejuuniv.smp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = "/productList")
public class ProductListController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productList() {

		ModelAndView modelAndView = new ModelAndView();

		List<Product> list = productService.productList();

		modelAndView.addObject("productList", list);
		modelAndView.setViewName("productList");

		return modelAndView;
	}
}
