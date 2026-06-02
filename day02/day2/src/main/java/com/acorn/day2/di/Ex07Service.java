package com.acorn.day2.di;

import org.springframework.stereotype.Component;

//스프링컨테이너 ioc컨테이너에게 객체생성을 부탁

@Component
public class Ex07Service {
	
	//화이팅매시지 반환 	
	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("집");
		sb.append("곧 갑니다");
		sb.append("모두 파이팅"); 
		
		return sb.toString();
		
		
	}

}
