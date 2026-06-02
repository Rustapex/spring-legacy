package com.acorn.prac.mvc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

	public int calc(int num1, int num2, String operator) {
		int result = 0;

		switch (operator) {
		case "add":
			result = num1 + num2;
			break;
		case "sub":
			result = num1 - num2;
			break;
		case "mul":
			result = num1 * num2;
			break;
		case "div":
			result = num1 / num2;
			break;
		}
		return result;
	}
}
