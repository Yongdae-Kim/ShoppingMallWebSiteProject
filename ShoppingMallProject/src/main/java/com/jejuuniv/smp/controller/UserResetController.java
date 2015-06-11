package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.user.UserService;

@Controller
public class UserResetController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userReset", method = RequestMethod.GET)
	public ModelAndView userInfoReset(@ModelAttribute User input,
			HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();

		User loginUser = (User) session.getAttribute("loginUser");

		String viewName = null;

		if (loginUser != null) {
			viewName = "userReset";
		} else {
			viewName = "redirect:userLogin";
		}

		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@RequestMapping(value = "/resetUserPassword", method = RequestMethod.POST)
	public ModelAndView userInfoResetForm(@ModelAttribute User input,
			HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {

			User resetUser = new User();
			resetUser.setName(loginUser.getName());
			resetUser.setPassword(input.getPassword());
			userService.resetUser(resetUser);

			viewName = "redirect:welcome";
		} else {
			viewName = "redirect:userLogin";
		}

		modelAndView.setViewName(viewName);
		return modelAndView;
	}
}
