
public class MaxMin {
	public static void main(String[] args) {
		int[] s = {49, 23, 61, 15, 92, 75, 84, 12, 91, 33};
		int max = s[0];
		
		for(int i=1; i<s.length; i++) {
			if(s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("최댓값: " + max);
		
		System.out.println();
	}
}
