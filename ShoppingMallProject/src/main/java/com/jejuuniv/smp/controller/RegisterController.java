package com.jejuuniv.smp.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.product.RegisteProductService;
import com.jejuuniv.smp.util.CurrentTime;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private RegisteProductService registeProductService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView register(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			viewName = "register";
		} else {
			viewName = "redirect:login";
		}
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registeForm(@ModelAttribute Product input,
			HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		User loginUser = (User) session.getAttribute("loginUser");

		String path = getRootPath(session);

		input.setSeller(loginUser.getName());
		input.setDate(CurrentTime.getNow());

		registeProductService.registeProduct(input, path);

		modelAndView.setViewName("redirect:list");
		return modelAndView;
	}

	private String getRootPath(HttpSession session) {
		return session.getServletContext().getRealPath("/") + File.separator;
	}
}
