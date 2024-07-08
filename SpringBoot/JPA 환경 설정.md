## JPA 환경 설정
```java
// build.gradle
dependencies {
	...
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'	
}
```

```java
// application.properties
...
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```
- spring.jpa.properties.hibernate.dialect
    - 스프링 부트와 하이버네이트를 함께 사용할 때 필요한 설정 항목
    - 표준 SQL이 아닌 하이버네이트만의 SQL을 사용할 때 필요한 항목
- spring.jpa.hibernate.ddl
    - 엔티티를 기준으로 데이터의 테이블을 생성하는 규칙을 설정
    - 개발 환경에는 보통 update를 사용하고, 운영 환경에서는 none, validate를 주로 사용

---

## 쿼리문 콘솔 확인 설정
```java
// application.properties
...
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.show_sql=true
```