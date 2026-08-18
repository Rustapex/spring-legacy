package com.acorn.prac2.Discount;

import org.springframework.stereotype.Component;

@Component
public class EventDiscount implements DiscountCal {

	@Override
	public double discount(int price) {

		System.out.println("특별 할인입니다.");
		double disPrice = price * 0.5;
		return disPrice;
	}

}
