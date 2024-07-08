## Spring Devtools
- 서버를 재시작하지 않아도 클래스를 변경할 때 서버가 자동으로 재가동 됨
```java
// build.gradle
dependencies {
	...
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
}
```