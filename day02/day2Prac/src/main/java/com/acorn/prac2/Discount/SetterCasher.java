package com.acorn.prac2.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterCasher {

	DiscountCal discountcal;

	public SetterCasher() {
	}
	@Autowired
	public void setDiscountcal(@Qualifier("clearanceDiscount") DiscountCal discountcal) {
		this.discountcal = discountcal;
	}

	public void printPrice(int price) {

		double resultPrice = discountcal.discount(price);

		System.out.println(price + "에서 할인된 가격은\n" + resultPrice + " 입니다.");
	}

}
