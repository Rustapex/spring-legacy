package com.acorn.prac2.Discount;

public class DiscountProgramMain {

    public static void main(String[] args) {

        DiscountProgram p = new DiscountProgram();

        p.setCalculator(new EventDiscountCalculator());
        p.printPrice(10000);
        p.printPrice(30000);
        p.printPrice(50000);

    }

}