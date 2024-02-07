package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(int s : scores) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95));
		System.out.println(scores.higher(95));
		System.out.println();
		
		System.out.println(scores.floor(95));
		System.out.println(scores.floor(94));
		System.out.println();
		
		System.out.println(scores.ceiling(87));
		System.out.println(scores.ceiling(88));
		System.out.println();
		
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.println(s);
		}
		System.out.println();
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.println(s);
		}
		System.out.println();
		
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer s : rangeSet) {
			System.out.println(s);
		}

	}

}
