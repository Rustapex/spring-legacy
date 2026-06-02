package com.acorn.prac.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcController {
	
	@Autowired
	CalcService service;
	
	// calcForm
	
	@RequestMapping(value="/calcForm", method=RequestMethod.GET)
	public String calcForm() {
		return "calcForm"; // 뷰 이름(forward까지 자동으로 해줌)
	}
	
	// 계산 처리
	@RequestMapping(value="/calcResult", method=RequestMethod.POST)
	public String calcResult(int num1, int num2, String operator, Model model) {
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(operator);
		
		// 서비스
		int result = service.calc(num1, num2, operator);
		
		model.addAttribute("data" , result);
		
		return "calcResult";
	}
}
