
public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "빨강";
		car1.gear = 5;
		car1.speed = 100;
		car1.kiloPerLiter = 6;
		
		System.out.println("114km를 가면 " + car1.calculateDistance(114) + "리터가 사용됨");
	}
}
