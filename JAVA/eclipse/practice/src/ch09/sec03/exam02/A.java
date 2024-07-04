package ch09.sec03.exam02;

public class A {
	
	static class B{
		
		int field1 = 1;
		
		static int field2 = 2;
		
		B() {
			System.out.println("B-생성 실행");
		}
		
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}
	

}
