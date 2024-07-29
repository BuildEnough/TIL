import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		radius = sc.nextDouble();
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}
