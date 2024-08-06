# 교육
## 2024-07-29(월)
OT  
자바 설정  
자바 기본 출력

## 2024-07-30(화)
조건문(if, switch)
반복문(for)

## 2024-07-31(수)
클래스  
객체  
생성자  
메소드

## 2024-08-01(목)
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


## 2024-08-02(금)
APMSETUP  
APMSETUP 비밀번호: root, apmsetup  

```
url
conn
stmt
rs
```

## 2024-08-06(화)
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
