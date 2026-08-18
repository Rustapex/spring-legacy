package com.acorn.prac2.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FieldDiscountCon {
	
	@Autowired
	FieldCasher fieldcasher;
	
	@RequestMapping("fieldDiscount")
	public String fieldDiscount(int price) {
		fieldcasher.printPrice(price);
		return "basicView";
	}
}
