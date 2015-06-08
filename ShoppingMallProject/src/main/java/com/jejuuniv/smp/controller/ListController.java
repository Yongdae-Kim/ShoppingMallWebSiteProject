package com.jejuuniv.smp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.ProductListService;

@Controller
@RequestMapping(value = "/list")
public class ListController {

	@Autowired
	private ProductListService productListService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {

		ModelAndView modelAndView = new ModelAndView();

		List<Product> list = productListService.productList();

		modelAndView.addObject("myList", list);
		modelAndView.setViewName("list");

		return modelAndView;
	}

}
