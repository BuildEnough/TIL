# switch문 주의사항
## 1. case 끝에 있는 break가 없다면 다음 case가 연달아 실행되는데, 이때는 case 값과는 상관없이 실행된다
```java
public class SwitchBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시간]: " + time + "");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default:
			System.out.println("외근을 나갑니다");
		}
	}
}
```
```
[현재 시간]: 9
회의를 합니다
업무를 봅니다
외근을 나갑니다
```

## 2. **switch 문의 괄호에는 정수 타입(byte, char, short, int, long)과 문자열 타입(String) 변수를 사용할 수 있다**
```java
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다");
			break;
		default:
			System.out.println("손님입니다");
		}
	}
}
```
일반 회원입니다
```

```