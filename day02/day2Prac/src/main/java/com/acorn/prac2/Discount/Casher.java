package com.acorn.prac2.Discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Casher {
	
	private DiscountCal discountCal; // 의존성 dependency

	public Casher() {
	}

	@Autowired
	public Casher(@Qualifier("eventDiscount") DiscountCal discountCal) {
		this.discountCal = discountCal;
	}

	public void setDiscountCal(DiscountCal discountCal) {
		this.discountCal = discountCal;
	}
	
	public void printPrice(int price) {
		
		double resultPrice = discountCal.discount(price);
		
		System.out.println(price +"에서 할인된 가격은\n"+ resultPrice + " 입니다.");
	}
	
	

}
