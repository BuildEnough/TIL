
public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volumn = 9;
		tv.onOff = true;
		
		System.out.println("채널: " + tv.channel);
		System.out.println("볼륨: " + tv.volumn);
		System.out.println("전원 여부: " + tv.onOff);
	}
}
