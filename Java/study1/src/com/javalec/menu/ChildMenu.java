package com.javalec.menu;

public class ChildMenu extends ParentMenu {
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	private void makeBeefChungGukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() {
		System.out.println("냄새 없는 청국장");
	}
}
