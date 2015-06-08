package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.SignupService;

@Controller
@RequestMapping(value = "/signup")
public class SignupController {

	@Autowired
	private SignupService signupService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView signupForm(@ModelAttribute User input) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = "";
		String msg = "";

		if (signupService.addUser(input)) {
			viewName = "redirect:login";
		} else {
			viewName = "signup";
			msg = "Email already in use by another account.";
		}
		modelAndView.addObject("msg", msg);
		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
