package ch07.sec11;

public sealed class Person permits Employee, Manager{
	
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}

}
