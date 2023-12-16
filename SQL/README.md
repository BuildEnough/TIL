## DML(Data Manipulation Language)
- 데이터 조작 언어
- 데이터를 조작(선택, 삽입, 수정, 삭제)하는데 사용되는 언어
- DML 구문이 사용되는 대상은 테이블의 행
- DML을 사용하기 위해서 꼭 그 이전에 테이블이 정의되어 있어야 함
- SQL문 중 SELECT, INSERT, UPDATE, DELETE가 이 구문에 해당
- Transaction이 발생하는 SQL도 이 DML에 속함
    - 테이블의 데이터를 변경(입력/수정/삭제)할 때 실제 테이블에 완전히 적용하지 않고, 임시로 적용시키는 것
    - 취소 가능

## DDL(Data Definition Language)
- 데이터 정의 언어
- 데이터베이스, 테이블, 뷰, 인덱스 등의 데이터베이스 개체를 생성/삭제/변경하는 역할
- CREATE, DROP, ALTER 구문
- DDL은 트랜잭션을 발생시키지 않는다
- ROLLBACK이나 COMMIT 사용 불가
- DDL문은 실행 즉시 MySQL에 적용

## DCL(Data Control Language)
- 데이터 제어 언어
- 사용자에게 어떤 권한을 부여하거나 빼앗을 때 사용하는 구문
- GRANT, REVOKE, ROLLBACK, COMMIT

---
### SHOW DATABASES
 - 현재 서버에 어떤 DB가 있는지 보기

### USE
- 사용할 데이터베이스 지정
- 지정해 놓은 후 특별히 다시 USE문 사용하거나 다른 DB를 사용하겠다고 명시하지 않는 이상 모든 SQL문은 지정 DB에서 수행
```sql
USE database_name
```
- Workbench에서 직접 선택해 사용가능
    - [Navigator] -> [SCHEMAS] -> 데이터베이스 선택

### SHOW TABLES
- 데이터베이스의 테이블 이름 보기

### SHOW TABLE STATUS
- 테이블의 상태 확인

### DESCRIBE(DESC)
- 테이블의 정보 보기
---

### SELECT
- <SELECT ... FROM>
- 요구하는 데이터를 가져오는 구문
- 읿반적으로 가장 많이 사용되는 구문
- 데이터베이스 내 테이블에서 원하는 정보를 추출
- SELECT 구문형식
```sql
SELECT select_expr
    FROM table_references
    WHERE where_condition
    GROUP BY cpl_name | expr | position
    HAVING where_condition
    ORDER BY col_name | expr | position
```
- SELECT 열 이름
    - 테이블에서 필요로 하는 열만 가져오기 가능
    - 여러 개의 열을 가져오고 싶을 때는 콤마로 구분
    - 열 이름의 순서는 출력하고 싶은 순서대로 배열 가능

### SELECT FROM WHERE
- 기본적인 WHERE절
    - 조회하는 결과에 특정한 조건으로 원하는 데이터만 보고 싶을 때 사용
    - SELECT 필드이름 FROM 테이블이름 WHERE 조건식;
    - 조건이 없을 경우 테이블의 크기가 클수록 찾는 시간과 노력이 증가
- 관계 연산자의 이용
    - OR 연산자
    - AND 연산자
    - 조건 연산자(=, <, >, <=, >=, <>, != 등)
    - 관계 연산자(NOT, AND, OR 등)
    - 연산자의 조합으로 데이터를 효율적으로 추출
- [MySQL 함수 및 연산자](https://dev.mysql.com/doc/refman/8.0/en/functions.html)

### BETWEEN
- 데이터가 숫자로 구성되어 있어 연속적인 값은 BETWEEN...AND 사용 가능

### IN
- 이산적인(Discrete) 값의 조건에서는 IN() 사용 가능

### LIKE
- 문자열의 내용을 검색하기 위해 LIKE 연산자 사용
- 문자 뒤에 %- 무엇이든(%) 허용
- 한 글자와 매치하기 위해서 '_' 사용