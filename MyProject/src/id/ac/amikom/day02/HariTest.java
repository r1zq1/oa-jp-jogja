package id.ac.amikom.day02;

public class HariTest {
	public static void main(String[] args) {
		int y = 100;
		Hari h = Hari.SENIN;
		for(Hari x : Hari.values()) {
			System.out.println(x.getAlias());
		}
	}
}