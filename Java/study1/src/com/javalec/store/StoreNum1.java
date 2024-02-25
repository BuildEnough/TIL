package com.javalec.store;

public class StoreNum1 extends HeadQuarterStore {

	public StoreNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderKimChijjige() {
		System.out.println("4500원 입니다");
	}
	
	@Override
	public void orderBuDaejjige() {
		System.out.println("5000원 입니다");
	}
	
	@Override
	public void orderSunDaeguk() {
		System.out.println("판매하지 않습니다");
	}
	
}
