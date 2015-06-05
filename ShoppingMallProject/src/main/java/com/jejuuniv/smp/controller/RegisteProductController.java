package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.RegisteProductService;
import com.jejuuniv.smp.util.CurrentTime;

@Controller
@RequestMapping(value = "/register")
public class RegisteProductController {

	@Autowired
	private RegisteProductService registeProductService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registeProduct(@ModelAttribute Product input) {
		ModelAndView modelAndView = new ModelAndView();

		registeProductService.save(newProduct(input));

		modelAndView.setViewName("redirect:list");
		return modelAndView;
	}

	private Product newProduct(Product input) {
		Product product = new Product();
		product.setImg(input.getImg());
		product.setName(input.getName());
		product.setDescription(input.getDescription());
		product.setPrice(input.getPrice());
		product.setDate(CurrentTime.getNow());
		product.setSeller(input.getSeller());

		return product;
	}
}
