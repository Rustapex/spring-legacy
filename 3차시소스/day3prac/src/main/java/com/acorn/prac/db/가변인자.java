package com.acorn.prac.db;

public class 가변인자 {
	
	public static void printInfo(String ...strings) {
		for(String s : strings) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		printInfo("안녕");
		
	}

}
