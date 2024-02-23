package com.javalec.hAve;

import java.util.Scanner;

public class HeightAve {

	public static void main(String[] args) {
		
		String[] iArrName = {"영희", "철수", "길동", "영수", "말자"};
		int[] iArr = new int[5];
		int totalHight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<iArrName.length; i++) {
			System.out.print(iArrName[i] + " 키를 입력하세요: ");
			iArr[i] = scanner.nextInt();
			totalHight += iArr[i];
		}
		System.out.println("학생들의 평균 신장은 " + (totalHight/iArrName.length) + "입니다");
		
		for(int i=0; i<iArr.length; i++) {
			if(iArr[i] > maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		System.out.println("가장 큰 학생은 " + iArrName[maxHIndex] + "입니다");
		
		minH = maxH;
		for(int i=0; i<iArr.length; i++) {
			if(iArr[i] <= minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + iArrName[minHIndex] + "입니다");

	}

}
