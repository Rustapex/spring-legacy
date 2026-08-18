package com.acorn.prac2.Discount;

public class DiscountProgram {

    private DiscountCal calculator;

    public void setCalculator(DiscountCal calculator) {
        this.calculator = calculator;
    }

    public void printPrice(int price) {
       double result = calculator.discount(price);
        System.out.println(result + "원입니다");
    }

}