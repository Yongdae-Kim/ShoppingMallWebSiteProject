package com.jejuuniv.smp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/userLost")
public class UserLostController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView userInfoLost() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userLost");
		return modelAndView;
	}
}
