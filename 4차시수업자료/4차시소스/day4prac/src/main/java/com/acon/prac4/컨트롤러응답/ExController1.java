package com.acon.prac4.컨트롤러응답;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExController1 {
	
	// 뷰 반환 spring mvc
	
	
	// 반환 타입 String => 뷰이름
	@RequestMapping(value ="/mvc1", method=RequestMethod.GET)
	public String mvc1() {
		return "view1";
	}
	
	// 반환타임 void => 매핑 이름 뷰로 인식
	
	@RequestMapping(value ="/mvc2", method=RequestMethod.GET)
	public void mvc2(Model model) {
		model.addAttribute("data", "bye~~");
	}
	
	// 반환 타입 Mode ANd View 이 개겣
	
	@RequestMapping(value ="/mvc3", method=RequestMethod.GET)
	public ModelAndView method3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view3");
		mv.addObject("data", "hello~~");
		return mv;
	}

}
