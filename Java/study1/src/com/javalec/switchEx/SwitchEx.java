package com.javalec.switchEx;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int result = i % 2;
		
		switch(result) {
		case 0:
			System.out.println("입력하신 숫자는 짝수입니다");
			break;
		case 1:
			System.out.println("입력하신 숫자는 홀수입니다");
			break;
		default:
			System.out.println("뭔데 이건, 그럴리 없다");
			break;
		}
			

	}

}
