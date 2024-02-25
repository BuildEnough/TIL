package com.javalec.inheritance;

public class MainClass {
	public static void main(String[] args) {
		ParentClass childClass = new ChildClass();
			
		System.out.print("아버님 이름: ");
		childClass.getPapaName();
		
		System.out.print("어머님 이름: ");
		childClass.getMamiName();
		
		System.out.println(childClass.pStr);
//		System.out.println(childClass1.cStr);

		ChildClass childClass1 = (ChildClass) childClass;
		System.out.println(childClass1.pStr);
		System.out.println(childClass1.cStr);
	}

}
