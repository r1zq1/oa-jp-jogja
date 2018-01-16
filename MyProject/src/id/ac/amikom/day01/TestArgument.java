package id.ac.amikom.day01;

public class TestArgument {
	public static void main(String[] args) {
		System.out.println("Entering main method ...");
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println("Leaving main method ...");
	}
}