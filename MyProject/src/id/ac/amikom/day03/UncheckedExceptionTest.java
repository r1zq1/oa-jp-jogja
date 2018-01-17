package id.ac.amikom.day03;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String s = null;
		if(s != null) {
			System.out.println(s.length());
		}
	}
}