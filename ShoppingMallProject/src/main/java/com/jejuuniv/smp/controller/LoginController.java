package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

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
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			viewName = "redirect:welcome";
		} else {
			viewName = "login";
		}

		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView loginForm(@ModelAttribute User input,
			RedirectAttributes redirectAttributes, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		if (userService.findUser(input) != null) {
			User user = userService.findUser(input);
			session.setAttribute("loginUser", user);
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
