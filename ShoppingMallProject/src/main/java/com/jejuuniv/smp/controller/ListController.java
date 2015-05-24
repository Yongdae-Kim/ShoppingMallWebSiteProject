package com.jejuuniv.smp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.User;

@Controller
@RequestMapping(value = "/list")
public class ListController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView();
		List<User> list = new ArrayList<User>();

		for (int i = 0; i < 50; i++) {
			list.add(new User("" + i, "test", "asd"));
		}

		modelAndView.addObject("myList", list);
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
