package id.ac.amikom.day03;

public class StringTest {
	public static void main(String[] args) {
		String abc = "Welcome to Jogja";
		System.out.println(abc.length());
		System.out.println(abc.substring(7));
		System.out.println(abc.substring(5, 10));
		System.out.println(abc.replace('e', 'i'));
		System.out.println(abc.charAt(11));
		System.out.println(abc.contains("to"));
		System.out.println(abc.indexOf("to"));
		String []word = abc.split("[oe]");
		for(String w : word) {
			System.out.println(w);
		}
		
		StringBuilder def = new StringBuilder("Welcome to Jogja");
		System.out.println(def.reverse());
		System.out.println(def.reverse());
	}
}