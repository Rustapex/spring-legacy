package com.acorn.prac2.애너테이션;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 계산을 해주는 프로그램

@Component
public class Program {

	Calculator calculator; // 의존성 dependency
	
	public Program() {
	}
	// 생성자 주입
	@Autowired
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
