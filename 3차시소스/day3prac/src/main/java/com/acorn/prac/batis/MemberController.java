package com.acorn.prac.batis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/list", method =RequestMethod.GET)
	public String getMembers(Model model) {
		try {
			List<Member> list = service.getMemberList();
			model.addAttribute("list", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "list";
	}
	
	// 등록 화면
	@RequestMapping(value="/register" , method = RequestMethod.GET)
	public String regFrom() {
		return "regForm";
	}
	
	// 등록 처리
	@RequestMapping(value="/regPross" , method = RequestMethod.POST)
	public String regPross(Member member) {
		//
		int result= service.registerMember(member);
		System.out.println(result);
		
		return "redirect:/";
	}
	
	
}
