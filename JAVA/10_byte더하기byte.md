## 정수 타입 변수가 산술 연산실에서 피연산자로 사용되면 int보다 작은 byte, short 타입의 변수는 int 타입으로 자동변환 된다
```java
byte x = 10;
byte y = 20;
byte result = x + y; // 컴파일 에러
int result = x + y;
```

### 에러 발생
```java
byte byteValue = 10;

byte result = byteValue + byteValue; // 컴파일 에러
```