package com.javalec.inputex;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("//Users//kim//Desktop//TIL//Java//study1//jain.txt");	
			while(true) {
				int i = is.read();
				System.out.println("데이터: " + i);
				if(i == -1) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
