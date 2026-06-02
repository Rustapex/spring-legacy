package com.acorn.day2.문제풀이;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Ex07Controller {
	
	
	
	//화이팅메시지 응답하기 
	@RequestMapping(value = "/ex07", method = RequestMethod.GET)
	public String fightmsg(Model model) {

		//문자열편집 
		//문자열수정할 수 있는 객체
		StringBuilder sb = new StringBuilder();
		sb.append("집");
		sb.append("곧 갑니다");
		sb.append("모두 파이팅");
		
		
		//
		sb.setCharAt(0, '차');
		

		model.addAttribute("msg", sb.toString());

		return "ex07";

	}
	
}
