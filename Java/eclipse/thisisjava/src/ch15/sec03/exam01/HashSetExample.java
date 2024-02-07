package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("Spring");
		
		int size = set.size();
		System.out.println(size);

	}

}
