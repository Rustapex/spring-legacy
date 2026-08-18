package com.acorn.prac2.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventDiscountCon {
	
	@Autowired
	Casher c;
	
	@RequestMapping(value="/event", method=RequestMethod.GET)
	public String eventDisMethod(int price) {
		c.printPrice(price);
		
		return "eventView";
		
	}
	

}
