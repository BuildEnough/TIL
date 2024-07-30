import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();
		
		System.out.print("난수의 개수: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		double sum = 0;
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);
			sum += number;
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum/count);
	}
}
