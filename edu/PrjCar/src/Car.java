
public class Car {
	int speed;
	int gear;
	String color;
	double kiloPerLiter;
	
	void changeGear(int gear) {
		this.gear = gear;
	}
	
	void speedUp() {
		this.speed = speed + 10;
	}
	
	void speedDown() {
		this.speed = speed - 10;
	}
	
	double calculateDistance(int distance) {
		return distance / this.kiloPerLiter;
	}
}