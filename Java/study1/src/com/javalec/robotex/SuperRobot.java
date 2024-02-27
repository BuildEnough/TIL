package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.IKnifeLazer;
import com.javalec.robotex.inter.MisailYes;

public class SuperRobot extends Robot {
	
	public SuperRobot() {
		fly = new FlyYes();
		misail = new MisailYes();
		knife = new IKnifeLazer();
	}
	
	@Override
	public void shape() {
		System.out.println("SuperRobot 로봇입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다");
	}
}
