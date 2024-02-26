package com.javalec.store;

public class MainClass {
	public static void main(String[] args) {
		HeadQuarterStore store1 = new StoreNum1();
		store1.orderKimChijjige();
		store1.orderBuDaejjige();
		store1.orderBiBimbap();
		store1.orderSunDaeguk();
		store1.orderGongGibap();
		System.out.println("===========================");
		
		HeadQuarterStore store2 = new StoreNum2();
		store2.orderKimChijjige();
		store2.orderBuDaejjige();
		store2.orderBiBimbap();
		store2.orderSunDaeguk();
		store2.orderGongGibap();
		System.out.println("===========================");
		
		HeadQuarterStore store3 = new StoreNum3();
		store3.orderKimChijjige();
		store3.orderBuDaejjige();
		store3.orderBiBimbap();
		store3.orderSunDaeguk();
		store3.orderGongGibap();
		System.out.println("===========================");
	}
}
