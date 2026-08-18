package com.acorn.prac2.Discount;

import org.springframework.stereotype.Component;

@Component("basicDiscount")
public class BasicDiscount implements DiscountCal{

	@Override
	public double discount(int price) {
		System.out.println("기본 할인입니다.");
		double disCountPrice = price * 0.9;
		return disCountPrice;
	}

}
