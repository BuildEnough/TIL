package com.javalec.intertoy;

public class PoohToyClass implements MoveArmLeg {
	
	public PoohToyClass() {
		System.out.println("곰돌이입니다");
		canMoveArmLeg();
		System.out.println("--------------------");
	}
	
	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다");
		
		
	}

}
