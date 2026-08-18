package com.acorn.prac2.Discount;

public class EventDiscountCalculator implements DiscountCal {

    @Override
    public double discount(int price) {
        System.out.println("이벤트 할인 계산기");
        return price - (price * 30 / 100);
    }

}