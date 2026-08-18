package com.acorn.prac2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramMain {
	
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/prac2/spring/setting.xml");
	
		// spring container 로부터 bean을 얻어오는 두 가지 방법
		/* 1. bean의 클래스 type
		 * 2. bean의 id 값
		 */
		
		// 1. bean의 클래스 type
		Program program = ac.getBean(Program.class);
		program.printCalc(6, 7);
		
		Program program2 = (Program) ac.getBean("p2");
		program2.printCalc(5, 2);
		
		if(program == program2) {
			System.out.println("spring container는 하나의 객체를 생성하고 관리한다.");
		}
	}

}
