package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("A", 40);
		System.out.println(map.size());
		System.out.println();
		
		String key = "A";
		int value = map.get(key);
		System.out.println(value);
		System.out.println();
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		map.remove("A");
		System.out.println(map.size());
		
		
		
		

	}

}
