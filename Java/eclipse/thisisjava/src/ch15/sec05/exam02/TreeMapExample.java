package ch15.sec05.exam02;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		

	}

}
