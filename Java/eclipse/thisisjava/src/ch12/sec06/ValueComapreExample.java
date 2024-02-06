package ch12.sec06;

public class ValueComapreExample {
	public static void main(String[] args) {
		Integer obj1 =  300;
		Integer obj2 =  300;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();
		
		Integer obj3 =  10;
		Integer obj4 =  10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		System.out.println();
	}

}
