package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = "/productUpdate")
public class ProductUpdateController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView productUpdate(@ModelAttribute Product product,
			HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		productService.registeProduct(product, session);
		modelAndView.setViewName("redirect:product?productId="
				+ product.getId());
		return modelAndView;
	}
}
