package com.javalec.childlunch;

public class Child2 extends LunchMenu {
	

	public Child2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}

	@Override
	public int calculation() {
		return rice + bulgogi + milk + almond;
	}
}
