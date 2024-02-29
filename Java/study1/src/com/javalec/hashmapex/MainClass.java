package com.javalec.hashmapex;

import java.util.HashMap;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		
		System.out.println(hashMap.toString());
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		System.out.println(hashMap.toString());
		
//		hashMap = null;
//		System.out.println(hashMap);
		System.out.println();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
	}

}
