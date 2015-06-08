package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.service.product.RegisteProductService;
import com.jejuuniv.smp.util.CurrentTime;

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

		registeProductService.addProduct(makeProduct(input));

		modelAndView.setViewName("redirect:list");
		return modelAndView;
	}

	private Product makeProduct(Product input) {
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
