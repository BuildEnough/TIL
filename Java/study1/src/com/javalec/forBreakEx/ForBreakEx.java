package com.javalec.forBreakEx;

public class ForBreakEx {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("i는 " + i + "입니다");
			if(i >= 3) break;
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			if(i == 3) continue;
			System.out.println("i는 " + i + "입니다");
		}

	}

}
