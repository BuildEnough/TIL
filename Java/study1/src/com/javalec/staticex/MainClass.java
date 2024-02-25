package com.javalec.staticex;

import com.javalec.children.FirstChild;
import com.javalec.children.SecondChild;
import com.javalec.children.ThirdChild;
import com.javalec.papa.PapaPouch;

public class MainClass {
	public static void main(String[] args) {
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
		System.out.println("PapaPouchmoney : " + PapaPouch.MONEY);
	}
}
