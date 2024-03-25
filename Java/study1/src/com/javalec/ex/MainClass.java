package com.javalec.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		  String[] arr = {"Hi", "How", "Are", "You"};
		  List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		  if(arrList.removeIf((String s) -> (s.length() <= 2))) {
		    System.out.println(arrList);
//		    System.out.println(s + "removed");
		  }
	}
}
