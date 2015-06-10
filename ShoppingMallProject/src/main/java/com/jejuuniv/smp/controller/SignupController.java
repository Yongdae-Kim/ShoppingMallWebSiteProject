package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.user.UserService;

@Controller
@RequestMapping(value = "/signup")
public class SignupController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView signupForm(@ModelAttribute User input,
			RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = "";

		if (userService.addUser(input)) {
			redirectAttributes.addFlashAttribute("name", input.getName());
			viewName = "redirect:login";
		} else {
			modelAndView.addObject("error",
					"Email already in use by another account.");
			viewName = "signup";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
