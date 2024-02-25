package com.javalec.overrideex;

public class MainClass {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.method1();
		childClass.method2();
		childClass.method3();
		System.out.println();
		
		ParentClass parentClass = (ParentClass) childClass;
		parentClass.method1();
	}

}
