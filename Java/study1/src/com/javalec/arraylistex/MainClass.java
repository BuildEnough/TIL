package com.javalec.arraylistex;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList);
		
		arrayList.set(2, "str22222");
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		arrayList.clear();
		System.out.println(arrayList);
		
		arrayList = null;
		System.out.println(arrayList);
//		System.out.println(arrayList.toString());
	}
}
