package com.acorn.prac2.web;

public class BCalculator implements Calculator{

	@Override
	public int calAdd(int su1, int su2) {
		System.out.println("B 계산기");
		return su1+su2;
	}

}
