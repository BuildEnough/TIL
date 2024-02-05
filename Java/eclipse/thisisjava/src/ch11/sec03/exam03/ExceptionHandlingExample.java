package ch11.sec03.exam03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
