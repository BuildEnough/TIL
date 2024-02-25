package com.javalec.overrideex;

public class ChildClass extends ParentClass {
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		System.out.println("ChildClass의 메소드1");
	}
	
	public void method3() {
		System.out.println("ChildClass의 메소드3");
	}

}
