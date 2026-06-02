package com.acorn.day2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex07SpringMVCController {
	
	 @Autowired     //필드주입 ( Injection)
	 Ex07Service service ;	 
	
	

	//화이팅메시지 응답하기 
	@RequestMapping(value = "/ex07s", method = RequestMethod.GET)
	public String fightmsg(Model model) {

	 		
		String msg  = service.getMessage();
		model.addAttribute("msg",msg);

		return "ex07";

	}

}
