 package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.IKnifeLazer;
import com.javalec.robotex.inter.MisailYes;

public class MainClass {
	public static void main(String[] args) {
		Robot superRobot = new SuperRobot();
		
		superRobot.shape();
		
//		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		
		superRobot.setKnife(new IKnifeLazer());
		superRobot.actionKnife();
		System.out.println();
		
		
	}

}
