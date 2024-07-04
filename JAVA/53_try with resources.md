## try-with-resources
- 예외 발생 여부와 상관없이 리소스를 자동으로 닫아줌
- 조건으로 `java.lang.AutoCloseable` 인터페이스를 구현해야 하고 `AutoCloseable` 인터페이스의 `close()` 메소드를 재정의 해야 한다
```java
public class FileInputStream implements AutoCloseable {
    ...
    @Override
    public void close() throws Exception { ... }
}
```

### 예제
```java
public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") 닫기]");
	}
}
```

```java
package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		/*try (
			MyResource res1 = new MyResource("A"); 
			MyResource res2 = new MyResource("B")
		) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}*/
		
		MyResource res1 = new MyResource("A"); 
		MyResource res2 = new MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
```

### 결과
```java
[MyResource(A) 열기]
[MyResource(A) 읽기]
[MyResource(A) 닫기]

[MyResource(A) 열기]
[MyResource(A) 읽기]
[MyResource(A) 닫기]
예외 처리: For input string: "abc"

[MyResource(A) 열기]
[MyResource(B) 열기]
[MyResource(A) 읽기]
[MyResource(B) 읽기]
[MyResource(B) 닫기]
[MyResource(A) 닫기]
```