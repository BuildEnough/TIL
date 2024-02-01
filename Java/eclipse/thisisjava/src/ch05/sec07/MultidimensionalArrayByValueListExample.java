package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		System.out.println("1차원 배열 길이: " + scores.length);
		System.out.println("2차원 배열 길이(첫번째 반): " + scores[0].length);
		System.out.println("2차원 배열 길이(두번째 반): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double)class1Sum/scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double)class2Sum/scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double)totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}

}
