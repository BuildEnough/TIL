## 열거 타입(Enum)
- 한정된 값을 갖는 타입을 열거 타입(enumeration type)라고 함

```java
public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

### 열거 상수
- 열거 타입으로 사용할 수 있는 한정된 값
```java
public enum LoginResult {
    LOGIN_SUCCESS,
    LOGIN_FAILED
}
```

### 열거 타입 사용
1. 열거 타입도 하나의 데이터 타입으모로 변수를 선언하고 사용해야 한다
```java
Week today;
Week reservationDay;
```

2. 열거 타입 변수에는 열거 상수를 대입할 수 있는데 `'열거타입.열거상수'` 형태로 작성한다
```java
Week today = Week.SUNDAY;
```