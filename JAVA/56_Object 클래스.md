## Object 클래스
- 클래스를 선언할 때 extends로 다른 클래스르 상속하지 않으면 암시적으로 `java.lang.Object` 클래스를 상속하게 된다  
- 자바의 모든 클래스는 Object의 자식이거나 자손 클래스
- 따라서 Object가 가진 메소드는 모든 객체에서 사용할 수 있다
    - `boolean equals(Obejct obj)`
    - `int hashCode()`
    - `String toString`

### 객체 동등 비교(equals)
- 객체의 번지를 비교하고 boolean 값을 return
- equals()의 매개변수 타입이 Object이므로 모든 객체가 매개값으로 대입될 수 있다
- 두 객체가 동일하면 true, 두 객체가 동일하지 않으면 false를 return
```java
public boolean equals(Object obj)
```
- equals() 메소드를 재정의 하여 사용
```java
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}
```

### 객체 해시코드(hashCode())
- 객체를 식별하는 정수
- 객체의 메모리 번지를 이용하여 해시코드를 생성하기 때문에 객체마다 다른 정수값을 return
- 두 객체가 동등한지 비교할 때 사용
- 객체의 데이터를 기준으로 재정의해서 새로운 정수값을 return 하도록 하는 것이 일반적
    - 객체가 다르더라도 내부 데이터가 동일하다면 같은 정수값을 return 하기 때문
```java
public int hashCode()
```

### equals()와 hashCode() 같이 사용
- 두 객체가 동등함을 비교할 때 `equals()`와 `hashCode()` 같이 사용함
1. hashCode()가 return 하는 정수값이 같은지 확인
2. equals() 메소드가 true를 리턴하는지 확인하여 동등 객체임을 비교
```java
public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}
```

```java
public class HashcodeExample {

	public static void main(String[] args) {
		Student s1= new Student(1, "홍길동");
		Student s2= new Student(1, "홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등객체");
			} else {
				System.out.println("동등객체 아님, 데이터가 다름");
			}
		} else {
			System.out.println("동등객체아님, 해시코드 다름");
		}

	}

}
```

```
동등객체
```

### 객체의 문자 정보(toString())
- 객체의 문자 정보를 return
- `toString()` 메소드를 재정의해서 사용
```java
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}

}
```