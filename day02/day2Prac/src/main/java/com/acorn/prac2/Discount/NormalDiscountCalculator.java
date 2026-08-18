package com.acorn.prac2.Discount;

public class NormalDiscountCalculator implements DiscountCal {

    @Override
    public double discount(int price) {
        System.out.println("일반 할인 계산기");
        return price - (price * 10 / 100);
    }

}