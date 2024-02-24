package com.javalec.manager;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("홍길동", 22, 20123487, "영극영화");
		studentManager.addStudent("홍길순", 24, 20101111, "수학과");
		studentManager.addStudent("이은경", 21, 20132222, "영문과");
		studentManager.addStudent("김순희", 23, 20163333, "체육과");
	}
	
	public void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " 학생 정보 입력 성공");
	}

}
