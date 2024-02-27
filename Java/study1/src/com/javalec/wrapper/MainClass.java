package com.javalec.wrapper;

public class MainClass {
	public static void main(String[] args) {
		Integer integer = new Integer(234);
		int i = integer.intValue();
		System.out.println(i);
		
		String str = "123";
		int ii = Integer.parseInt(str);
		System.out.println(ii + 10);
	}

}
