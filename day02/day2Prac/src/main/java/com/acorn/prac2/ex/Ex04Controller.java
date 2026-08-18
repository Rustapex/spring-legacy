package com.acorn.prac2.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex04Controller{

	@Autowired	// 필드 주입
	Ex04Service service;
	
	
	@RequestMapping(value ="/ex04" , method=RequestMethod.GET)
	public String ex04(Model model) {
		Acorn acorn = service.getAcornInfo();
		
		model.addAttribute("data", acorn);
		return "ex04View";
	}
}
