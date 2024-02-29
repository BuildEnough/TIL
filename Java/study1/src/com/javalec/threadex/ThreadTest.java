package com.javalec.threadex;

import java.util.Iterator;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}

}
