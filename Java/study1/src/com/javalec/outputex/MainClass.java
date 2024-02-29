package com.javalec.outputex;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		OutputStream os  = null;
		
		try {
			os = new FileOutputStream("//Users//kim//Desktop//TIL//Java//study1//jaout.txt");
			String str = "오늘 날씨는 아주 좋습니다";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) os.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
