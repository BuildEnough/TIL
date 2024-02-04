package ch09.sec02.exam02;

public class A {
	
	class B {
		int field1 = 1;
		
		static int field2 = 2;
		
		B() {
			System.out.println("B-생성자 실행");
		}
		
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}
	
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}

}
