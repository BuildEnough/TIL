## 예외 떠넘기기
메소드 내부에서 예외가 발생할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만,메소드를 호출한 곳으로 예외를 떠넘길 수도 있다(`throws`)

## throws
- 메소드 선언부 끝에 작성
- 떠넘길 예외 클래스를 쉼표로 구분해서 나열
```java
리턴 타입 메소드명(매개변수, ...) throws 예외클래스1, 예외클래스2 ... {
    
}
```
- throws가 붙어 있는 메소드에서 해당 예외를 처리하지 않고 떠넘겼기 때문에 해당 메소드를 호출하는 곳에서 예외를 받아 처리해야 함

## 예제
- ClassNotFoundException을 throws하는 method2()의 예외를 method1()에서 호출할 때 처리하고 있다
```java
public void method1() {
    try {
        mehtod2();
    } catch(ClassNotFoundException e) {
        System.out.println("예외처리: " + e.getMessage()):
    }
}

public void method2() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
}
```

## throws Exception, throws Throwable
- 나열해야 할 예외 클래스가 많을 경우 `throws Exception` 또는 `throws Throwable`만으로 모든 예외를 간단히 넘길 수 있다

## main() 메소드에서의 throws
- main() 메소드에서도 throws 키워드를 사용해서 예외를 떠넘길 수 있다
- JVM이 최종적으로 예외 처리를 하게 된다