package ch08.sec08;

public class MultiInterfaceImpleExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("http://www.youtube.com");

	}

}
