package com.javalec.interfacephone;

public class APhone implements IFunction {
	@Override
	public void callSenderReceive() {
		System.out.println("A가능합니다");
		
	}

	@Override
	public void cansLte() {
		System.out.println("A불가능합니다, 3G입니다");
		
	}
	
	@Override
	public void tvRemoteController() {
		System.out.println("A미탑재 되어있습니다");
		
	}
}
