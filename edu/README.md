# 교육
## JAVA
### 2024-07-29(월)
OT  
자바 설정  
자바 기본 출력

### 2024-07-30(화)
조건문(if, switch)
반복문(for)

### 2024-07-31(수)
클래스  
객체  
생성자  
메소드

### 2024-08-01(목)
자바 AWT와 스윙  
GUI  
```java
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
```

```java
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { "Backspace", "", "", "CE", "C",
								"7", "8", "9", "/", "sqrt",
								"4", "5", "6", "x", "%",
								"1", "2", "3", "-", "1/x",
								"0", "+/-", ".", "+", "=",
							  };

	public Calculator() {
		tField = new JTextField(35); // 너비가 35인 텍스트 필드를 생성
		panel = new JPanel();
		tField.setText("0.0"); // 초기 텍스트를 "0."으로 설정
		tField.setEnabled(true); // false: 텍스트 필드를 비활성화하여 사용자가 직접 입력하지 못하게 함, true: 수정 가능
		panel.setLayout(new GridLayout(5, 5, 10, 10)); //  5x5 그리드 레이아웃을 설정
		buttons = new JButton[25]; // 총 버튼 칸 수
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 3) {					
					buttons[index].setForeground(Color.red); // 3열 이상 빨간색
				} else {					
					buttons[index].setForeground(Color.blue); // 3열 이하 파란색
				}
				buttons[index].setBackground(Color.yellow); // 배경색 노랑
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack(); // 컴포넌트 크기에 맞게 창 크기를 자동 조절
	}

	public static void main(String args[]) {
		Calculator s = new Calculator();
	}
}
```

## DATABASE
### 2024-08-02(금)
APMSETUP  
APMSETUP 비밀번호: root, apmsetup  

```
url
conn
stmt
rs
```

### 2024-08-06(화)
ORACLE XE 11g  
root 계정, PW: 1234  
사용자 계정: SCOTT 
```sql
SELECT * FROM emp;
SELECT empno, ename, sal FROM emp WHERE sal >= 4000;
SELECT ename, hiredate FROM emp WHERE hiredate > '81/12/25';

SELECT empno, ename, sal FROM emp WHERE sal BETWEEN 2000 AND 3000;

SELECT ename FROM emp ORDER BY ename;

SELECT ename FROM emp WHERE ename BETWEEN 'JAMES' AND 'MARTIN' ORDER BY ename;

SELECT empno, ename, deptno FROM emp WHERE deptno IN(10, 20);

SELECT empno, ename, sal FROM emp WHERE sal LIKE '1%';
SELECT empno, ename, sal FROM emp WHERE sal LIKE '1___';

SELECT empno, ename, sal FROM emp WHERE ename LIKE 'A%';

SELECT ename, hiredate FROM emp WHERE ename = 'SMITH';
SELECT empno, ename, hiredate FROM emp WHERE hiredate LIKE '80%';

SELECT empno, ename, hiredate FROM emp WHERE hiredate LIKE '___12%';

SELECT deptno, ename, comm FROM emp WHERE deptno in (20, 30);

SELECT empno, ename, comm FROM emp WHERE comm IS NOT NULL;

SELECT ename, hiredate, sal FROM emp WHERE hiredate > '82/01/01' AND sal >= 1300;
SELECT ename, hiredate, sal FROM emp WHERE hiredate > '82/01/01' OR sal >= 1300;

SELECT empno, ename, sal, comm
FROM emp
WHERE sal > 1000
AND (comm < 1000 OR comm IS NULL);

SELECT empno, ename, sal, comm
FROM emp
WHERE sal > 1000
AND comm < 1000 OR comm IS NULL;

SELECT empno, ename, hiredate
FROM emp
WHERE sal > 1000
ORDER BY 2, 1;

SELECT studno, name, deptno1, 1
FROM student
WHERE deptno1 LIKE 101
UNION ALL
SELECT profno, name, deptno, 2
FROM professor
WHERE deptno LIKE 101;

SELECT studno, name, deptno1, 1
FROM student
WHERE deptno1 LIKE 101
UNION
SELECT profno, name, deptno, 2
FROM professor
WHERE deptno LIKE 101;

SELECT studno, name
FROM student
WHERE deptno1 LIKE 101
INTERSECT
SELECT studno, name
FROM student
WHERE deptno2 LIKE 201;

SELECT empno, ename, sal
FROM emp
MINUS
SELECT empno, ename, sal
FROM emp
WHERE sal > 2500;

SELECT 'A-B-C-D', INSTR('A-B-C-D', '-', -6, 2) "INSTR"
FROM dual;

SELECT name, tel, INSTR(tel, ')')
FROM student
WHERE deptno1 = 201;

SELECT name, tel, SUBSTR(tel, 0, INSTR(tel, ')')-1) AS "AREA CODE"
FROM student
WHERE deptno1 LIKE 201;
```

### 2024-08-07(수)
ORACLE 함수  
많이 사용하는 함수를 잘 알고 사용하자  
`묵시적 형 변환`과 `묵시적 형변환`  
```SQL
SELECT * FROM emp;

SELECT MAX(sal + NVL(comm, 0)) AS MAX,
MIN(sal + NVL(comm, 0)) AS MIN,
ROUND(avg(sal+NVL(comm, 0)), 1) AS AVG
FROM emp;

SELECT ename, REPLACE(ename, SUBSTR(ename, 1, 2), '**') AS REPLACE
FROM emp
WHERE deptno LIKE 10;

SELECT ename, REPLACE(ename, SUBSTR(ename, 2, 2), '--') AS REPLACE
FROM emp
WHERE deptno LIKE 20;


SELECT name, tel, REPLACE(tel, SUBSTR(tel, INSTR(tel, ')', 1)+1, 3), '***') AS REPLACE
FROM student
WHERE deptno1 LIKE 102;

SELECT ROUND(987.654, 2) AS ROUND1,
        ROUND(987.654, 0) AS ROUND2,
        ROUND(987.654, -1) AS ROUND3
FROM dual;


SELECT TRUNC(987.654, 2) AS TRUNC1,
        TRUNC(987.654, 0) AS TRUNC2,
        TRUNC(987.654, -1) AS TRUNC3
FROM dual;

SELECT MOD(121, 10) AS MOD,
        CEIL(123.45) AS CEIL,
        FLOOR(123.45) AS FLOOR
FROM dual;

SELECT SYSDATE FROM dual;

SELECT MONTHS_BETWEEN('14/09/30' ,'14/08/31') AS MONTHS_BETWEEN
FROM dual;

SELECT ABS(MONTHS_BETWEEN('14/08/30' ,'14/09/30')) AS MONTHS_BETWEEN
FROM dual;

SELECT studno, name, birthday
FROM student
WHERE TO_CHAR(birthday, 'MM') = '01';

SELECT empno, ename, hiredate
FROM emp
WHERE TO_CHAR(hiredate, 'MM') IN ('01', '02', '03');

SELECT empno, ename, sal, comm,
TO_CHAR((sal*12)+comm, '999,999') AS SALARY
FROM emp
WHERE ename = 'ALLEN';

SELECT name, pay, bonus,
TO_CHAR((pay*12)+bonus, '999,999') AS TOTAL
FROM professor
WHERE deptno LIKE 201;

SELECT empno, ename, hiredate,
TO_CHAR((sal*12)+comm, '$999,999') AS SAL,
TO_CHAR(((sal*12)+comm)*1.15, '$999,999') AS "15% UP"
FROM emp
WHERE comm IS NOT NULL;

SELECT TO_NUMBER('5')
FROM dual;

-- SELECT TO_NUMBER('A') FROM dual;

SELECT ASCII('A') AS "아스키 코드"
FROM dual;

SELECT TO_DATE('14/05/31') FROM dual;
SELECT TO_DATE('2014/05/31') FROM dual;

SELECT ename, comm, NVL(comm, 0), NVL(comm, 100)
FROM emp
WHERE deptno = 30;

SELECT profno, name, pay, bonus,
    TO_CHAR((pay*12)+NVL(bonus, 0), '999,999') AS TOTAL
FROM Professor
WHERE deptno = 201;

SELECT empno, ename, sal, comm,
    NVL2(comm, sal+comm, sal * 0) AS "NVL2"
FROM emp
WHERE deptno = 30;

SELECT empno, ename, sal, comm,
    NVL(comm, sal+comm) AS "NVL"
FROM emp
WHERE deptno = 30;

SELECT empno, ename, comm,
    NVL2(comm, 'Exist', 'NULL') AS "NVL2"
FROM emp
WHERE deptno = 30;

SELECT empno, ename, comm,
    NVL(TO_CHAR(comm), 'NULL') AS "NVL"
FROM emp
WHERE deptno = 30;

SELECT deptno, name, DECODE(deptno, 101, 'Computer Engineering') AS "DNAME"
FROM professor;

SELECT deptno, name, 
       DECODE(deptno, 101, 'Computer Engineering', ' ') AS "DNAME"
FROM professor;

SELECT name, jumin,
    DECODE(SUBSTR(jumin, 7, 1), '1', 'MAN', '2', 'WOMAN') AS "GENDER"
FROM student
WHERE deptno1 LIKE 101;


SELECT name, tel,
    DECODE(SUBSTR(tel, 1, INSTR(tel, ')')-1), '02', '서울',
                                            '031', '경기',
                                            '051', '부산',
                                            '052', '울산',
                                            '055', '경남') "LOC"
FROM student
WHERE deptno1 LIKE 101;

SELECT name, tel,
    CASE
        WHEN SUBSTR(tel, 1, INSTR(tel, ')')-1) = '02' THEN '서울'
        WHEN SUBSTR(tel, 1, INSTR(tel, ')')-1) = '031' THEN '경기'
        WHEN SUBSTR(tel, 1, INSTR(tel, ')')-1) = '051' THEN '부산'
        WHEN SUBSTR(tel, 1, INSTR(tel, ')')-1) = '052' THEN '울산'
        WHEN SUBSTR(tel, 1, INSTR(tel, ')')-1) = '055' THEN '경남'
        ELSE '기타'
    END AS "LOC"
FROM student
WHERE deptno1 LIKE 101;

SELECT empno, ename, sal,
    CASE WHEN sal BETWEEN 1 AND 1000 THEN 'LEVEL 1'
        WHEN sal BETWEEN 1001 AND 2000 THEN 'LEVEL 2'
        WHEN sal BETWEEN 2001 AND 3000 THEN 'LEVEL 3'
        WHEN sal BETWEEN 3001 AND 4000 THEN 'LEVEL 4'
    END "LEVEL"
FROM emp
ORDER BY sal DESC;

SELECT *
FROM t_reg
WHERE REGEXP_LIKE(text, '[a-z]');
```

### 2024-08-08(목)
원하는 데이터를 데이터베이스 안에서 찾아오는 것이 제일 중요함  
```SQL
-- 소문자로 시작하지 않는 행
SELECT *
FROM t_reg
WHERE REGEXP_LIKE(text, '^[^a-z]');

-- 숫자로 시작하지 않는 행
SELECT *
FROM t_reg
WHERE REGEXP_LIKE(text, '^[^0-9]');

-- 소문자가 들어 있는 모든 행 제거
SELECT *
FROM t_reg
WHERE NOT REGEXP_LIKE(text, '[a-z]');

-- student 테이블에서 지역번호가 2자리, 국번이 연속적으로 4자리가 나오는 값 출력
SELECT name, tel
FROM student
WHERE REGEXP_LIKE(tel, '^[0-9]{2}\)[0-9]{4}');

--student 테이블에서 학생의 id에서 4번째 자리에 r(소문자)이 있는 행 출력
SELECT name, id
FROM student
WHERE REGEXP_LIKE(id, '...r.');

-- 75true 입력
SELECT studno, name, id
FROM student
WHERE id=REGEXP_REPLACE('&id', '( ){1,}', '');

--문자열에서 기호를 기준으로 3번 째의 문자열을 출력
SELECT REGEXP_SUBSTR('sys/oracle@racdb:1521:racdb', '[^:]+', 1, 3) result
FROM dual;

--문자열에서 기호를 기준으로 2번 째의 문자열을 출력
SELECT REGEXP_SUBSTR('sys/oracle@racdb:1521:racdb', '[^:]+', 1, 2) result
FROM dual;

-- 대문자 A의 개수 출력
SELECT text, REGEXP_COUNT(text, 'A')
FROM t_reg;


SELECT deptno, job, AVG(NVL(sal, 0)) "AVG_SAL"
FROM emp
GROUP BY deptno, job
ORDER BY 1, 2 DESC;

SELECT deptno, job, ROUND(AVG(sal), 1) AS avg_sal, COUNT(*) AS cnt_emp
FROM emp
GROUP BY ROLLUP (deptno, job);

SELECT deptno, position, COUNT(*), SUM(PAY)
FROM professor
GROUP BY deptno, ROLLUP(position);



CREATE TABLE professor2
AS SELECT deptno, position, pay
FROM professor;

INSERT INTO professor2 VALUES(101, 'instructor', 100);
INSERT INTO professor2 VALUES(101, 'a full professor', 100);
INSERT INTO professor2 VALUES(101, 'assistant professor', 100);

SELECT * FROM professor2
ORDER BY deptno, position;

SELECT deptno, position, SUM(pay)
FROM professor2
GROUP BY deptno, ROLLUP(position);

-- CUBE 함수: 소계와 전체 합계까지 출력하는 함수
SELECT deptno, NULL JOB, ROUND(AVG(sal), 1) AS AVG_SAL, COUNT(*) AS CNT_EMP
FROM emp
GROUP BY deptno
UNION ALL
SELECT NULL deptno, job, ROUND(AVG(sal), 1) AVG_SAL, COUNT(*) AS CNT_EMP
FROM emp
GROUP BY job
UNION ALL
SELECT deptno, job, ROUND(AVG(sal), 1) AS AVG_SAL, COUNT(*) AS CNT_EMP
FROM emp
GROUP BY deptno, job
UNION ALL
SELECT NULL deptno, NULL job, ROUND(AVG(sal), 1) AS AVG_SAL, COUNT(*) AS CNT_EMP
FROM emp
ORDER BY deptno, job;

SELECT grade, deptno1, COUNT(*), SUM(height), SUM(weight)
FROM student
GROUP BY GROUPING SETS(grade, deptno1);

SELECT deptno, LISTAGG(ename, '->') WITHIN GROUP(ORDER BY hiredate) AS "LISTAGG"
FROM emp
GROUP BY deptno;

SELECT MAX(DECODE(day, 'SUN', dayno)) AS SUN,
        MAX(DECODE(day, 'MON', dayno)) AS MON,
        MAX(DECODE(day, 'TUE', dayno)) AS TUE,
        MAX(DECODE(day, 'WED', dayno)) AS WED,
        MAX(DECODE(day, 'THU', dayno)) AS THU,
        MAX(DECODE(day, 'FRI', dayno)) AS FRI,
        MAX(DECODE(day, 'SAT', dayno)) AS SAT
FROM cal
GROUP BY weekno
ORDER BY Weekno;

SELECT (DECODE(day, 'SUN', dayno, ' ')) AS SUN,
       (DECODE(day, 'MON', dayno, ' ')) AS MON,
       (DECODE(day, 'TUE', dayno, ' ')) AS TUE,
       (DECODE(day, 'WED', dayno, ' ')) AS WED,
       (DECODE(day, 'THU', dayno, ' ')) AS THU,
       (DECODE(day, 'FRI', dayno, ' ')) AS FRI,
       (DECODE(day, 'SAT', dayno, ' ')) AS SAT
FROM cal;

SELECT ASCII('2')
FROM dual;

SELECT ASCII('29')
FROM dual;

SELECT ASCII('8')
FROM dual;


SELECT * FROM (SELECT deptno, job, empno FROM emp)
PIVOT (
    COUNT(empno) FOR job in ('CLERK' AS "CLERK",
                            'MANAGER' AS "MANAGER",
                            'PRESIDENT' AS "PRESIDENT",
                            'ANALYST' AS "ANSLYST",
                            'SALESMAN' AS "SALESMAN")
        )
ORDER BY deptno;

SELECT * FROM (SELECT deptno, job, empno, sal FROM emp)
PIVOT (
    COUNT(empno) AS COUNT,
    SUM(NVL(sal, 0)) AS SUM FOR job IN ('CLERK' AS "C",
                            'MANAGER' AS "M",
                            'PRESIDENT' AS "P",
                            'ANALYST' AS "A",
                            'SALESMAN' AS "S")
        )
ORDER BY deptno;



CREATE TABLE upivot
AS SELECT * FROM (SELECT deptno, job, empno FROM emp)
PIVOT (
    COUNT(empno)
    FOR job IN ('CLERK' AS "CLERK",
                'MANAGER' AS "MANAGER",
                'PRESIDENT' AS "PRESIDENT",
                'ANALYST' AS "ANSLYST",
                'SALESMAN' AS "SALESMAN")
        );
SELECT * FROM upivot;

SELECT ename, hiredate, sal,
    LAG(sal, 1, 0) OVER(ORDER BY hiredate) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LAG(sal, 2, 0) OVER(ORDER BY hiredate) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LAG(sal, 3, 0) OVER(ORDER BY hiredate) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LAG(sal, 1, 2) OVER(ORDER BY ename) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LAG(sal, 2, 2) OVER(ORDER BY ename) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LAG(sal, 3, 2) OVER(ORDER BY ename) "LEG"
FROM  emp;

SELECT ename, hiredate, sal,
    LEAD(sal, 2, 1) OVER(ORDER BY hiredate) "LEAD"
FROM  emp;

SELECT RANK('SMITH') WITHIN GROUP(ORDER BY ename) "RANK"
FROM emp;

SELECT empno, ename, sal,
    RANK() OVER(ORDER BY sal) AS RNAK_ASC,
    RANK() OVER(ORDER BY sal DESC) AS RNAK_DESC
FROM emp;

SELECT empno, ename, sal,
    RANK() OVER(ORDER BY sal DESC) AS RNAK
FROM emp
WHERE deptno = 10;

SELECT empno, ename, sal, deptno,
    RANK() OVER(PARTITION BY deptno
                ORDER BY sal DESC) AS RANK
FROM emp;

SELECT empno, ename, sal, deptno,
    RANK() OVER(PARTITION BY deptno, job
                ORDER BY sal DESC) AS RANK
FROM emp;

SELECT empno, ename, sal,
    RANK() OVER(ORDER BY sal DESC) AS sal_rank,
    DENSE_RANK() OVER(ORDER BY sal DESC) sal_dense_rank
FROM emp;

SELECT p_date, p_code, p_qty, p_total,
        SUM(p_total) OVER(ORDER BY p_total) AS TOTAL
FROM panmae
WHERE p_store = 1000;

SELECT p_date, p_code, p_qty, p_total,
        SUM(p_total) OVER(PARTITION BY p_code ORDER BY p_total) AS TOTAL
FROM panmae
WHERE p_store = 1000;

SELECT p_code, p_store, p_date, p_qty, p_total,
        SUM(p_total) OVER(PARTITION BY p_code, p_store ORDER BY p_date) AS TOTAL
FROM panmae;
```

### 2024-08-09(금)
JOIN