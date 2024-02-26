package com.javalec.interfacephone;

public class BPhone implements IFunction {
	@Override
	public void callSenderReceive() {
		System.out.println("B가능합니다");
		
	}

	@Override
	public void cansLte() {
		System.out.println("B가능합니다, 4G입니다");
		
	}
	
	@Override
	public void tvRemoteController() {
		System.out.println("B탑재 되어있습니다");
		
	}
}
