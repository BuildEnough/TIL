package com.javalec.interfacephone;

public class CPhone implements IFunction {
	@Override
	public void callSenderReceive() {
		System.out.println("C가능합니다");
		
	}

	@Override
	public void cansLte() {
		System.out.println("C가능합니다, 4G입니다");
		
	}
	
	@Override
	public void tvRemoteController() {
		System.out.println("C탑재 되어있습니다");
		
	}
}
