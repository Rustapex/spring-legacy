package com.acorn.prac2.ex;

import org.springframework.stereotype.Service;

@Service
public class Ex04Service {

	public Acorn getAcornInfo() {
		Acorn acorn = new Acorn();
		acorn.setId("acorn1");
		acorn.setName("김건희");
		
		return acorn;
		
		
	}
}
