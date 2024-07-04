package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println(obj.intValue());
		System.out.println(obj);
		System.out.println();
		
		int value = obj;
		System.out.println(value);
		
		int result = obj + 100;
		System.out.println(result);

	}

}
