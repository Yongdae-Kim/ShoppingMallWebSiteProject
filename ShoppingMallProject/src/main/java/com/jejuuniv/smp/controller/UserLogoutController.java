package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/userLogout")
public class UserLogoutController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView userLogout(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		session.setAttribute("loginUser", null);
		modelAndView.setViewName("redirect:welcome");
		return modelAndView;
	}
}
