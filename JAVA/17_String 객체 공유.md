## Java는 문자열이 동일하다면 String 객체를 공유하도록 설계되어 있다

### 객체 공유하는 경우
```java
String name1 = "홍길동";
String name2 = "홍길동";
```

### 객체 공유하지 않는 경우
```java
String name1 = new String("홍길동");
String name2 = new String("홍길동");
```