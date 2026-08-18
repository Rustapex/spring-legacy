package com.acorn.prac2.Discount;

import org.springframework.stereotype.Component;

@Component("clearanceDiscount")
public class ClearanceDiscount implements DiscountCal{

	@Override
	public double discount(int price) {
		System.out.println("재고 정리 할인입니다.");
		double disCountPrice = price * 0.3;
		return disCountPrice;
	}

}
