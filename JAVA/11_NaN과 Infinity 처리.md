1. 나눗셈(/) 또는 나머지(%) 연산에서 좌측이 정수, 우측이 0일 경우 예외(ArithmeticException) 발생, 무한대의 값을 정수로 표현할 수 없다
2. 하지만 (좌측이 실수) OR (우측이 0.0 또는 0.0f이면) 예외가 발생하지 않고 Infinity(무한대) 또는 NaN(Not a Number)이 된다
```java
5 / 0.0 -> Infinity
5 % 0,0 -> NaN
```

## Infinity 또는 NaN인지 확인하기 위해 `Double.isInfinite()`와 `Double.isNaN()`을 사용
```java
boolean result = Double.isInfinite(변수);
boolean result = Double.isNaN(변수);
```

### 예제
```java
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z = x % y;
		
		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
	}
}
```

### 결과
```java
Infinity
값 산출 불가
```