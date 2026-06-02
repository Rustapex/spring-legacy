package com.acon.prac4.컨트롤러응답;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExController2 {
	
	// 데이터 응답
	
	// 예전 방식 응답 
	// HTTPServletResponse.getWriter().print("데이터")
	@RequestMapping(value ="/data1", method=RequestMethod.GET)
	public void data1(HttpServletResponse response) {
		try {
			response.getWriter().print("data");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 반환 String -> 문자열 응답 O
	@RequestMapping(value ="/data2", method=RequestMethod.GET)
	public String data2() {
		return "data2 ^^";
	}
	
	// @ResponseBody
	
	// 반환 Acorn -> acorn 객체 json 응답
	@ResponseBody
	@RequestMapping(value ="/data3", method=RequestMethod.GET)
	public Food data3() {
		Food food = new Food();
		food.setName("짜장면");
		food.setPrice("8000");
		
		return food;
	}
	
	// food 정보 여러 개 반환하기
	@ResponseBody
	@RequestMapping(value ="/data4", method=RequestMethod.GET)
	public List<Food> data4(){
		List<Food> list = new ArrayList<Food>();
		list.add(new Food("짜장면", "8000"));
		list.add(new Food("짬뽕", "9000"));
		list.add(new Food("탕수육", "20000"));
		
		return list;
	}
	
	// 음식 정보 등록하기
	@ResponseBody
	@RequestMapping(value ="/regData/{id}", method=RequestMethod.POST)
	public int regData(@RequestBody Food food,
			@PathVariable(name="id") String id
			) { //json 데이터 -> java 객체
		System.out.println(food);
		System.out.println(id);
		// 서비스 -> repopsitory - > db
		return 1;
		
	}
	
	// ResponseEntity
	
	@RequestMapping(value ="/data5", method=RequestMethod.GET)
	public ResponseEntity<Food> data5(){
		Food food = new Food();
		food.setName("짜장면");
		food.setPrice("8000");
		
		return ResponseEntity.status(HttpStatus.OK).body(food);
	}

}
