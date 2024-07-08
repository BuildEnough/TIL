## H2 database
```java
// build.gradle
dependencies {
    ...
	runtimeOnly 'com.h2database:h2'
}
```

```java
//application.properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:~/local
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
```
- spring.h2.console.enabled
    - H2 콘솔에 접속할 것인지 묻는 항목
    - true 설정
    - H2 콘솔은 H2 데이터베이스를 웹 UI로 보여줌
- spring.h2.console.path
    - H2 콘솔로 접속하기 위한 URL 경로
- spring.datasource.url
    - 데이터베이스에 접속하기 위한 경로
- spring.datasource.driverClassName
    - 데이터베이스에 접속할 때 사용하는 드라이버 클래스명
- spring.datasource.username
    - 데이터베이스 사용자 명
- spring.datasource.password
    - 데이터베이스 비밀번호