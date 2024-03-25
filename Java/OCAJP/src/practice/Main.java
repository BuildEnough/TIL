package practice;

public class Main {
	public static void main(String[] args) {
		String stuff = "TV";
		String res = null;
		if (stuff.equals("TV")) {
			res = "Walter";
		} else if (stuff.equals("Movie")) {
			res = "White";
		} else {
			res = "No result";
		}
	}
}