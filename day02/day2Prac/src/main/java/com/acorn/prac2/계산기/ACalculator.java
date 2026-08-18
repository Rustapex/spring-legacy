package com.acorn.prac2.계산기;

public class ACalculator implements Calculator{

	@Override
	public int calAdd(int su1, int su2) {
		System.out.println("A 계산기");
		return su1+su2;
	}

}
