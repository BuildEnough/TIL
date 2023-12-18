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

### Sub Query
- 서브 쿼리
- 쿼리문 안에 또 쿼리문이 들어 있는 것
- 서브 쿼리의 결과가 둘 이상이 되면 에러 발생

### ANY
- 서브쿼리의 여러 개의 결과 중 한 가지만 만족해도 가능
- SOME은 ANY와 동일한 의미로 사용
- =ANY 구문은 IN과 동일한 의미

### ALL
- 서브쿼리의 여러 개의 결과를 모두 만족시켜야 함

### ORDER BY
- 결과가 출력되는 순서를 조절하는 구문
- 기본적으로 오름차순 정렬
- 내림차순으로 정렬
    - 열 이름 뒤에 DESC
- ASC(오름차순)는 default 이므로 생략 가능
- ORDER BY 구문을 혼합해 사용하는 구문 가능

### DISTINCT
- 중복된 것은 1개씩만 보여주면서 출력
- 테이블의 크기가 클수록 효율적

### LIMIT
- 출력 개수를 제한
- 상위의 N개만 출력하는 LIMIT N 구문
- 서버의 처리량을 많이 사용해 서버의 전반적인 성능을 나쁘게 하는 악성 쿼리문을 개선할 때 사용

### GROUP BY
- 그룹으로 묶어주는 역할
- 집계함수(Aggregate Function)를 함께 사용
    - AVG(): 평균
    - MIN(): 최소값
    - MAX(): 최대값
    - COUNT(): 행의 개수
    - COUNT(DISINCT): 중복 제외된 행의 개수
    - STDEV(): 표준 편차
    - VARIANCE(): 분산
- 효율적인 데이터 그룹화
- 읽기 좋게 하기 위해 별칭(Alias) 사용

### HAVING
- WHERE과 비슷한 개념으로 조건 제한
- 집계 함수에 대해서 조건 제한하는 편리한 개념
- HAVING절은 반드시 GROUP BY 절 다음에 나와야 함

### ROLLUP
- 총합 또는 중간합게가 필요할 경우 사용
- GROUP BY절과 함께 WITH ROLLUP문 사용 

### JOIN
- JOIN은 데이터베이스 내의 여러 테이블에서 가져온 레코드를 조합하여 하나의 테이블이나 겨로가 집합으로 표현
---

### MySQL 내장함수
- 사용자의 편의를 위해 다양한 기능의 내장 함수를 미리 정의하여 제공
- 대표적인 내장 함수의 종류
    - 문자열 함수
    - 수학 함수
    - 날짜와 시간 함수

### LENGTH()
- 전달받은 문자열의 길이를 반환

### CONCAT()
- 전달받은 문자열을 모두 결합하여 하나의 문자열로 반환
- 전달받은 문자열 중 하나라도 NULL이 존재하면 NULL 반환

### LOCATE
- 문자열 내에서 찾는 문자열이 처음으로 나타나는 위치를 찾아서 해당 위치를 반환
- 찾는 문자열이 문자열 내에 존재하지 않으면 0을 반환
- MySQL에서는 문자열의 시작 인덱스를 1부터 계산

### LEFT(), RIGHT()
- LEFT(): 문자열의 왼쪽부터 지정한 개수만큼의 문자를 반환
- RIGHT(): 문자열의 오른쪽부터 지정한 개수만큼의 문자를 반환

### LOWER(), UPPER()
- LOWER(): 문자열의 문자를 모두 소문자로 변경
- UPPER(): 문자열의 문자를 모두 대문자로 변경

### REPLACE()
- 문자열에서 특정 문자열을 대체 문자열로 교체

### TRIM()
- 문자열의 앞이나 뒤, 또는 양쪽 모두에 있는 특정 문자를 제거
- TRIM() 함수에서 사용할 수 있는 지정자
    - BOTH: 전달받은 문자열의 양 끝에 존재하는 특정 문자를 제거(기본 설정)
    - LEADING: 전달받은 문자열 앞에 존재하는 특정 문자를 제거
    - TRAILING: 전달받은 문자열 뒤에 존재하는 특정 문자를 제거
- 만약 지정자를 명시하지 않으면, 자동으로 BOTH로 설정
- 제거할 문자를 명시하지 않으면, 자동으로 공백을 제거

### FORMAT()
- 숫자 타입의 데이터를 세 자리마다 쉼표(,)를 사용하는 '#,###,###.##' 형식으로 변환
- 반환되는 데이터의 형식은 문자열 타입
- 두 번째 인수는 반올림할 소수 부분의 자릿수

### FLOOR(), CEIL(), ROUND()
- FLOOR(): 내림
- CEIL(): 올림
- ROUND(): 반올림

### SORT(), POW(), EXP(), LOG()
- SORT(): 양의 제곱근
- POW(): 첫 번째 인수로는 밑수를 전달하고, 두 번째 인수로는 지수를 전달하여 거읍제곱 계산
- EXP(): 인수로 지수를 전달받아, e의 거듭제곱을 계산
- LOG(): 자연로그 값을 계산

### SIN(), COS(), TAN()
- SIN(): 사인 값 반환
- COS(): 코사인 값 반환
- TAN(): 탄젠트 값 반환

### ABS(), RAND()
- ABS(X): 절대값을 반환
- RAND(): 0.0보다 크거가 같고 1.0보다 작은 하나의 실수를 무작위로 생성

### NOW(), CURDATE(), CURTIME()
- NOW(): 현재 날짜와 시간을 반환, 반환되는 값은 'YYYY-MM-DD HH:MM:SS' 또는 YYYYMMDDHHMMSS 형태로 반환
- CURDATE(): 현재 날짜를 반환, 이때 반환되는 값은 'YYYY-MM-DD' 또는 YYYYMMDD 형태로 반환
- CURTIME(): 현재 시각을 반환, 이때 반환되는 값은 'HH:MM:SS' 또는 HHMMSS 형태로 반환

### DATE(), MONTH(), HOUR(), MINUTE(), SECOND()
- DATE(): 전달받은 값에 해당하는 날짜 정보를 반환
- MONTH(): 월에 해당하는 값을 반환하며, 0부터 12 사이의 값을 가짐
- HOUR(): 시간에 해당하는 값을 반환하며, 0부터 23 사이의 값을 가짐
- MINUTE(): 분에 해당하는 값을 반환하며, 0부터 59 사이의 값을 가짐
- SECOND(): 초에 해당하는 값을 반환하며, 0부터 59 사이의 값을 가짐

### MONTHNAME(), DAYNAME()
- MONTHNAME(): 월에 해당하는 이름을 반환
- DAYNAME(): 요일에 해당하는 이름을 반환

### DAYOFWEEK(), DAYOFMONTH(), DAYOFYEAR()
- DAYOFWEEK(): 일자가 해당 주에서 몇 번쨰 날인지를 반환, 1부터 7 사이의 값을 반환(일요일 = 1, 토요일 = 7)
- DAYOFMONTH(): 일자가 해당 월에서 몇 번째 날인지를 반환, 0부터 31 사이의 값을 반환
- DAYOFYEAR(): 일자가 해당 연도에서 몇 번째 날인지를 반환, 1부터 366 사이의 값을 반환

### DATE_FORMAT()
- 전달받은 형식에 맞춰 날짜와 시간 정보를 문자열로 반환