package com.javalec.hashsetex;

import java.util.HashSet;

public class MainClass {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("이순신", 6));
		hashSet.add(new Student("장보고", 1));
		System.out.println(hashSet.toString());
		
		Student student = new Student("이순신", 6);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
	}

}
