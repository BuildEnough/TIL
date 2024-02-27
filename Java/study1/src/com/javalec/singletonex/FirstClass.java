package com.javalec.singletonex;

public class FirstClass {
	public FirstClass() {
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
	}

}
