package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString  = subject.substring(location);
		System.out.println(subString);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}

	}

}
