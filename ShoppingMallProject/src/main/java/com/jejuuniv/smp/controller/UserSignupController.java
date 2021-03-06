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
@RequestMapping(value = "/userSignup")
public class UserSignupController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView userSignup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userSignup");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView userSignupForm(@ModelAttribute User user,
			HttpSession session, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView();

		String viewName = "";

		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser != null) {
			session.setAttribute("loginUser", null);
		}

		if (userService.addUser(user)) {
			redirectAttributes.addFlashAttribute("id", user.getId());
			viewName = "redirect:userLogin";
		} else {
			modelAndView.addObject("msg",
					"Email already in use by another account.");
			viewName = "userSignup";
		}

		modelAndView.setViewName(viewName);

		return modelAndView;
	}
}
