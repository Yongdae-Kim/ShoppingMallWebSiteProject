package com.jejuuniv.smp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jejuuniv.smp.model.Product;
import com.jejuuniv.smp.model.User;
import com.jejuuniv.smp.service.product.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView product(@RequestParam("productId") long productId,
			HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();

		User loginUser = (User) session.getAttribute("loginUser");

		Product findProduct = productService.findProduct(productId);

		if (loginUser != null) {
			String loginUserName = loginUser.getName();
			String seller = findProduct.getSeller();

			if (loginUserName.equals(seller)) {
				modelAndView.addObject("seller", seller);
			}
		}

		modelAndView.addObject("product", findProduct);
		modelAndView.setViewName("product");
		return modelAndView;
	}
}
