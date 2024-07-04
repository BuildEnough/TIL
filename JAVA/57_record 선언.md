## record
- Java 14 부터 `recode` 도입
- 데이터 전달을 위한 DTO를 작성할 때 반복적으로 사용되는 코드를 줄이기 위해 도입

### record 미사용
```java
public class Person {
    private final String name;
    private final int age;
    
    public Person(String name, int age) { // 필드 이름과 동일한 Getter 메소드
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public String age() {
        return this.age;
    }

    @Override
    public int hashCode() {
        ...
    }

    @Override
    public boolean equals(Object obj) {

    }
    
    @Override
    public String toString() {
        ...
    }
}
```

### recode 사용
```java
public record Person(String name, int age)
```
- 위의 record 미사용 코드와 동일함
- private final 필드가 자동 생성되고, 생성자 및 Getter 메소드가 자동으로 추가됨
- hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동 추가됨