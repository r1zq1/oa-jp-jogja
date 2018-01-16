package id.ac.amikom.day01;

public class StringTest {
	public static void main(String[] args) {
		String a = "Hello";
		System.out.println(System.identityHashCode(a));
		a = a + " Jogja";
		System.out.println(System.identityHashCode(a));
		
		String b = "Hello";
		System.out.println(System.identityHashCode(b));
		String c = new String("Hello");
		System.out.println(System.identityHashCode(c));
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(System.identityHashCode(sb));		
		sb = sb.append(" Jogja");
		System.out.println(System.identityHashCode(sb));
		
		String s = null;
		if(s != null && s.length() == 0) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		
	}
}