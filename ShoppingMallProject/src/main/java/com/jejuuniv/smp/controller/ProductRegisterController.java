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
import com.jejuuniv.smp.service.product.ProductService;
import com.jejuuniv.smp.util.CurrentTime;

@Controller
@RequestMapping(value = "/productRegister")
public class ProductRegisterController {

	@Autowired
	private ProductService productService;

	private long id = 0;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productRegister(HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		String viewName = null;

		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			viewName = "productRegister";
		} else {
			viewName = "redirect:userLogin";
		}
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView productRegisteForm(@ModelAttribute Product input,
			HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		User loginUser = (User) session.getAttribute("loginUser");

		String path = getRootPath(session);

		input.setId(id++);
		input.setSeller(loginUser.getName());
		input.setDate(CurrentTime.getNow());

		productService.registeProduct(input, path);

		modelAndView.setViewName("redirect:productList");
		return modelAndView;
	}

	private String getRootPath(HttpSession session) {
		return session.getServletContext().getRealPath("/") + File.separator;
	}
}
