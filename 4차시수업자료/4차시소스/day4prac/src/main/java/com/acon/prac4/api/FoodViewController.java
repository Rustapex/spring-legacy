package com.acon.prac4.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodViewController {

	@RequestMapping(value = "/foodView", method = RequestMethod.GET)
	public String method1() {
		return "foodView";
	}

}
