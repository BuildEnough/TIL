package com.javalec.whileEx;

public class WhileEx {
	public static void main(String[] args) {
//		int i = 0;
//		
//		while(i<=10) {
//			System.out.println("i는" + i + "입니다");
//			i++;
//		}
		
		int i = 0;
		int sum = 0;
		while(i <= 100) {
			if(i%3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("0 ~ 100까지의 3의 배수의 합은 " + sum + "입니다");
	}
}
