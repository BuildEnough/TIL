## main() 메소드에서 String[] args 매개변수가 필요한 이유
- 윈도우의 명령 프롬프트나 맥OS의 터미널에서 프로그램을 실행할 때는 요구하는 값이 있을 수 있다
1. 두 수를 입력받고 덧셈을 수행하는 Sum 프로그램은 실행할 때 두 수를 요구할 수 있다
    ```
    java sum 10 20
    ```
2. 공백으로 구분된 10과 20은 문자열로 취급되며 String[] 배열의 항목 값으로 구성되고 main() 메소드 호출 시 매개값으로 전달된다(args로 10과 20이 들어감)
```java
public static void main(String[] args) {...}
```