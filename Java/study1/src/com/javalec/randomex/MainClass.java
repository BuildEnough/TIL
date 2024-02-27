package com.javalec.randomex;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		
		int di = (int) (d * 10);
		System.out.println(di);
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
		
		double dd = random.nextDouble();
		System.out.println(dd);
		
	}
}
