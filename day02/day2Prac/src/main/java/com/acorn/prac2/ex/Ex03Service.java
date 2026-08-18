package com.acorn.prac2.ex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Service, @Repository => 의미만 부여한 component 임. service = repository = component 
@Component
public class Ex03Service {
	public List<String> getDan(int dan) {
		System.out.println(dan);

		List<String> list = new ArrayList<String>();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		Ex03Service service = new Ex03Service();
		List<String> result = service.getDan(3);
		
		System.out.println(result.get(0));
		
	}
}
