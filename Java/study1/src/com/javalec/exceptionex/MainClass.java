package com.javalec.exceptionex;

public class MainClass {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i*j);
		
		try {
			System.out.println(i/j);			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(i+j);
		System.out.println(i-j);
	}

}
