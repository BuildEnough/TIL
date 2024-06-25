## while() 뒤에 반드시 세미콜론(;)을 붙여야 한다
```java
do {
    실행문;
} while (조건식);
```

### 예시
```java
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while(! inputString.equals("q")) ;
			
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
```

### 결과
```
메시지를 입력하세요
프로그램을 종료하려면 q를 입력하세요
>안녕
안녕
>안녕
안녕
>q
q

프로그램 종료
```