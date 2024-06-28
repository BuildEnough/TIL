package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
	}

}
