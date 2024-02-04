package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
//		ib.methodC();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
