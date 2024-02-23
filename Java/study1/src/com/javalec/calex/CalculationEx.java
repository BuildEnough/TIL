package com.javalec.calex;

public class CalculationEx {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		int h = 5;
		
//		System.out.println("산술 연산자");
//		System.out.println(i+j); // 13
//		System.out.println(i-j); // 7
//		System.out.println(i*j); // 30
//		System.out.println(i/j); // 3
//		System.out.println(i%j); // 1
		
//		System.out.println("자동증감 연산자");
//		i++;
//		System.out.println(i); // 10 -> 11
//		j--;
//		System.out.println(j); // 3 -> 2
		
//		System.out.println("동등비교 연산자");
//		System.out.println(i == j); // false
//		System.out.println(i != j); // true
//		System.out.println(i > j); // true
//		System.out.println(i < j); // false
		
		i = 10;
		j = 3;
		h = 5;
		
//		System.out.println("논리 연산자");
//		System.out.println(i>j && i>h); // true
//		System.out.println(i>j && i<h); // false
//		System.out.println(i>j || i<h); // true
//		System.out.println(i>j || i>h); // true
		
//		System.out.println("삼항 연산자");
//		int result = h != 5 ? 1 : 2; // result = 2
//		System.out.println(result);  // 2
		
//		System.out.println("할당 연산자");
//		h = i;
//		System.out.println(h); // 10
		
		i = 11;
		System.out.println("줄여 쓰는 연산자");
		i = i + 100;
		System.out.println(i); // 111
		
		i = 11;
		i += 100; // i = i + 100;
		System.out.println(i); // 111
		
		
	}

}
