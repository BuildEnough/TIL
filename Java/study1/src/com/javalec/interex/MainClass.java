package com.javalec.interex;

public class MainClass {
	public static void main(String[] args) {
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.getStr();
		interfaceClass.calculate();
		System.out.println();
		
		InterfaceEx ife = new InterfaceClass();
		InterfaceEx2 ife2 = new InterfaceClass();
		
		ife.calculate();
//		ife.getStr();
		
//		ife2.calculate();
		ife2.getStr();
	}

}
