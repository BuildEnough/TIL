
public class RollDice {
	public static void main(String[] args) {
		final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0; i<10000; i++) {
			++freq[(int)(Math.random() * SIZE)];
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.println((i+1) + "\t" + freq[i]);
		}
		
		int max = freq[0];
        int min = freq[0];
        
		for(int i=0; i<SIZE; i++) {
			if(freq[i] > max) {
				max = freq[i];
			}
			if (freq[i] < min) {
                min = freq[i];
            }
		}
		System.out.println("min: " + min + " max: " + max);
	}
}
