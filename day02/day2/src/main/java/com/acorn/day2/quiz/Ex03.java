package com.acorn.day2.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {

	public static void main(String[] args) {
		 
		List<OpenAiModel> models = new ArrayList<>(List.of(

		        new OpenAiModel("gpt-5.5", "가장 똑똑함, 코딩/전문 업무용", 5, 0, 30),
		        new OpenAiModel("gpt-5.5-pro", "더 깊게 생각하는 고성능 모델", 30, 0, 180),
		        new OpenAiModel("gpt-5.4", "성능과 비용 균형형", 2, 0, 15),
		        new OpenAiModel("gpt-5.4-mini", "빠르고 저렴한 실무형", 1, 0, 4),
		        new OpenAiModel("gpt-5.4-nano", "가장 저렴한 대량 처리용", 0, 0, 1),
		        new OpenAiModel("gpt-5.4-pro", "정확도 높은 고급 추론용", 30, 0, 180),

		        new OpenAiModel("gpt-realtime-2-text", "실시간 대화/음성 서비스용", 4, 0, 24),
		        new OpenAiModel("gpt-realtime-mini-text", "저렴한 실시간 대화용", 1, 0, 2),

		        new OpenAiModel("gpt-image-2-text", "이미지 생성 프롬프트 처리용", 5, 1, 0),
		        new OpenAiModel("gpt-image-2-image", "이미지 생성/편집용", 8, 2, 30)

		));
		
		
		
		System.out.println( models);
		
		//문제   모델객체로 부터 이름만 리스트로 만드시오		
		//스트림의 map과  collector를 사용하거나 반복문으로 직접해도 됩니다
	}

}
