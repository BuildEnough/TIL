package com.javalec.interfacephone;

public class MainClass {
	public static void main(String[] args) {
//		APhone aPhone = new APhone();
//		BPhone bPhone = new BPhone();
//		CPhone cPhone = new CPhone();
		
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone, aPhone};
		
		for(int i=0; i<iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].cansLte();
			iFunctions[i].tvRemoteController();
			System.out.println();
		}
		
	}

}
