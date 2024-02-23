package com.javalec.ifelseif;

public class IfElseIf {

	public static void main(String[] args) {
		int seoul = 5000;
		
		if(seoul >= 9000) {
			System.out.println("엄청 비싸");
		} else if(seoul >= 7000) {
			System.out.println("조금 비싸");
		} else if(seoul >= 5000) {
			System.out.println("적당한 가격");
		} else {
			System.out.println("싸구만");
		}

	}

}
