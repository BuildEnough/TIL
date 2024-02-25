package com.javalec.children;

import com.javalec.papa.PapaPouch;

public class FirstChild {
	
	public FirstChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) System.out.println("첫째는 돈이 없어 못 받았습니다");
	}
}
