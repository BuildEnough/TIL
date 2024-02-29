package com.javalec.networkex;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {
	
	Scanner scanner;
	
	public InetAdressEx() {
		System.out.println("HOST 이름을 입력하세요");
		scanner = new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer NAME: " + inetAddress.getHostName());
			System.out.println("Computer IP: " + inetAddress.getHostAddress());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
