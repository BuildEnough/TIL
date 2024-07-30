import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("정답을 입력해주세요: ");
		int answer = sc.nextInt();
		
		int guess;
		int tries = 0;
		
		do {
			System.out.print("예상하는 정답 입력: ");
			guess = sc.nextInt();
			tries++;
			
			if (guess > answer) {
				System.out.println("예상된 정답보다 높습니다");
			} else if (guess < answer){
				System.out.println("예상된 정답보다 낮습니다");
			} 
		} while (guess != answer);
		
		System.out.println("정답입니다, 시도횟수: " + tries);
		
	}
}
