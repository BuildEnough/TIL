package ch06.sec09;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
//		setSpeed(100);
		System.out.println(model + "가 달립니다.(시속: " + speed + "km/h)");
	}
}
