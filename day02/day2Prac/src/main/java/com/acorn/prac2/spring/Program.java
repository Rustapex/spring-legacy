package com.acorn.prac2.spring;

// 계산을 해주는 프로그램
public class Program {

	Calculator calculator; // 의존성 dependency
	
	public Program() {
	}
	// 생성자 주입
	public Program(Calculator calculator) {
		this.calculator = calculator;
	}
	//setter 주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void printCalc(int su1, int su2) {

		//
		int result = calculator.calAdd(su1, su2);

		System.out.println(result + " 입니다");
	}




	

	

}
