package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = "/productModify")
public class ProductModifyController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView productModify(@RequestParam("productId") long productId) {
		ModelAndView modelAndView = new ModelAndView();
		Product findProduct = productService.findProduct(productId);
		modelAndView.addObject("product", findProduct);
		modelAndView.setViewName("productUpdate");
		return modelAndView;
	}

}
