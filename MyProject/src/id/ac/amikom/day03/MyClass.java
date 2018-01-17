package id.ac.amikom.day03;

public class MyClass {
	public void methodA() {
		methodA();
	}
	public static void main(String[] args) {
		new MyClass().methodA();
	}
}
