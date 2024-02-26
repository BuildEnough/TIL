package com.javalec.interex;

public class InterfaceClass implements InterfaceEx, InterfaceEx2 {
	
	@Override
	public String getStr() {
		System.out.println("실제 구현은 여기서 합니다str");
		return null;
	}
	
	@Override
	public void calculate() {
		System.out.println("실제 구현은 여기서 합니다cal");
	}

}
