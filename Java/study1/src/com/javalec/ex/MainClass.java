package com.javalec.ex;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
//		int j = 10;
//		int sum = 0;
//		for(int i=1; i<=j; i++) {
//			int h = i % 2;
//			if(h == 0) { // h == 1
//				sum += i;				
//			}
//		}
//		System.out.println(sum);

		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + " = " + (j*i) + "\t");
			}
			System.out.println();
		}
	}

}
