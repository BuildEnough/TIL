1. 소스파일(.java) 파일 생성
2. java compiler의 Javac 명령어를 통해 컴파일
3. 바이트코드 파일(.class)을 특정 운영체제가 이해하는 기계어로 번역하고 실행시키는 명령어는 java
4. java 명령어는 JDK가 설치된 자바 가상 머신 Java Virtual Machine(JVM)을 구동시켜, 바이트 코드 파일을 완전한 기계어로 번역하고 실행
5. JVM을 통해 컴퓨터가 읽을 수 있는 기계어(각 OS에 맞는 기계어)로 해석

## 정리
1. 자바 소스 파일(~.java)을 작성
2. java.exe로 바이트코드 파일(~.class) 생성
3. java.exe로 JVM 구동
4. JVM은 main() 메소드를 찾아 메소드 블록 실행시킴