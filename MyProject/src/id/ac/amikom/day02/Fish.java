package id.ac.amikom.day02;

public class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public void play() {
		System.out.println("Ikan bermain air");
	}
	public void walk() {
		System.out.println("Ikan tidak berjalan, tetapi berenang");
	}
	public void eat() {
		System.out.println("Ikan makan plankton");
	}
}
