package com.javalec.threadex2;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("B");
		
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
