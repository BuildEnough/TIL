package com.javalec.ex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		  String[][] arr = { { "A", "B", "C"}, { "D", "E" }};
		  for (int i=0; i<arr.length; i++) {
		    for(int j=0; j<arr[0].length; j++) {
		      System.out.print(arr[i][j] + " ");
		      if(arr[i][j].equals("D")) {
		        break;
		      }
		    }
		    continue;
		    
		  }
	}
}
