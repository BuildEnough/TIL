package com.javalec.ex;

public class Test {
	  public static void main(String[] args) {
		  System.out.println("Hello " + new StringBuilder("Java SE 8"));
		  System.out.println("Hello " + new MyString("Java SE 8"));
		  MyString m = new MyString("Java");
		  System.out.println(m.msg);
	}
}
