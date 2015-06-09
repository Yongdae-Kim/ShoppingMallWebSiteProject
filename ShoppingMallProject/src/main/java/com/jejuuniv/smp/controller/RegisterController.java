package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.RegisteProductService;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private RegisteProductService registeProductService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registeForm(@ModelAttribute Product input) {
		ModelAndView modelAndView = new ModelAndView();
		registeProductService.addProduct(input);
		modelAndView.setViewName("redirect:list");
		return modelAndView;
	}
}
