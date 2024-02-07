package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		Tv tv = product1.getKind();
		String tvModel= product1.getModel();

	}

}
