package com.javalec.childlunch;

public class MainClass {
	public static void main(String[] args) {
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		LunchMenu child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("child1의 식대: " + child1.calculation());
		System.out.println("child2의 식대: " + child2.calculation());
		
	}

}
