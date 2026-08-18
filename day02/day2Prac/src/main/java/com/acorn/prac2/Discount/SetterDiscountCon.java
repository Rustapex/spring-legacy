package com.acorn.prac2.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SetterDiscountCon {
	
	@Autowired
	SetterCasher setterCasher;
	
	@RequestMapping("/setterDiscount")
	public String setterDiscount(int price) {
		setterCasher.printPrice(price);
		return "clearView";
	}

}
