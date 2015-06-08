package com.jejuuniv.smp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.user.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView loginForm(@ModelAttribute User input,
			RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = "";

		if (loginService.findUser(input) != null) {
			User user = loginService.findUser(input);
			redirectAttributes.addFlashAttribute("user", user);
			viewName = "redirect:list";
		} else {
			modelAndView.addObject("error", "Invalid username and password!");
			viewName = "login";
		}
		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
