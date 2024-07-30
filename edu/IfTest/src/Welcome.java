import java.util.Date;

public class Welcome {
	public static void main(String[] args) {
		
		Date date = new Date();
		int currentHour = date.getHours();
		
		System.out.println("현재 시간: " + currentHour);
		
		if(currentHour < 11) {
			System.out.println("좋은 아침");
		} else if(currentHour < 15) {
			System.out.println("좋은 오후");
		} else if(currentHour < 20) {
			System.out.println("좋은 저녁");
		} else {
			System.out.println("잠");
		}
	}
}
