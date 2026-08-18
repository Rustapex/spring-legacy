package com.acorn.prac2.애너테이션;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 계산을 해주는 프로그램
// spring에게 객체 생성 bean

@Controller
public class CalcProgram2Controller {
	
	@Autowired
	Program p;
	
	@RequestMapping(value ="/cal2", method=RequestMethod.GET)
	public String method1(int su1,int su2) {
		
		p.printCalc(su1,su2);
		return "calView2";
	}

}
