## proteced 접근 제한자
- 같은 패키지에서는 default처럼 접근이 가능하나, 다른 패키지에서는 자식 클래스만 접근을 허용
- `필드`, `생성자`, `메소드 선언`에 사용 가능

```java
package ch07.sec06.package1;

public class A {

	protected String field;
	
	protected A() {
		
	}
	
	protected void method() {
		
	}
}

```

### new 연산자를 사용해서 생성자를 직접 호출할 수 없고, 자식 생성자에서 `super()`로 부모 생성자를 호출할 수 있다
- 상속을 통해서만 사용 가능

```java
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
```