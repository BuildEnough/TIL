package com.javalec.childlunch;

public class Child1 extends LunchMenu {
	

	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}

	@Override
	public int calculation() {
		return rice + bulgogi + banana;
	}
}
