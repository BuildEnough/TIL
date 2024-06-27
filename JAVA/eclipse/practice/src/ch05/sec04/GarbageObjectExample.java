package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);

	}

}
