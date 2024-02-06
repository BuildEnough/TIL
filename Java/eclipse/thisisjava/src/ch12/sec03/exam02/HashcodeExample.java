package ch12.sec03.exam02;

public class HashcodeExample {

	public static void main(String[] args) {
		Student s1= new Student(1, "홍길동");
		Student s2= new Student(1, "홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등객체");
			} else {
				System.out.println("동등객체 아님, 데이터가 다름");
			}
		} else {
			System.out.println("동등객체아님, 해시코드 다름");
		}

	}

}
