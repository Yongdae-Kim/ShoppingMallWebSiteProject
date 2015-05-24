package com.jejuuniv.smp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/reset")
public class ResetController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView reset() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("reset");
		return modelAndView;
	}
}
