## Spring Boot Validation 라이브러리
- 폼 클래스를 사용해 사용자로부터 입력받은 값을 검증

### 설치
```java
// build.gradle
dependencies {
    ...
	implementation 'org.springframework.boot:spring-boot-starter-validation'
}
```

### @Size
- 문자 길이 제한

### @NotNull
- Null을 허용하지 않는다

### @NotEmpty
- Null 또는 빈 문자열("")을 허용하지 않는다

### @Past
- 과거 날짜만 입력 가능

### @Future
- 미래 날짜만 입력 가능

### @FutureOrPresent
- 미래 또는 오늘 날짜만 입력 가능

### @Max
- 최댓값 이하의 값만 입력 가능

### @Min
- 최솟값 이상의 값만 입력 가능

### @Pattern
- 입력값을 정규식 패턴으로 검증