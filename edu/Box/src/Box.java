import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형 가로 입력:");
		w = sc.nextInt();
		System.out.println("사각형 세로 입력:");
		h = sc.nextInt();
		area = w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + perimeter);
	}

}
