package id.ac.amikom.day02;

public class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat() {
		this("Kitty");
	}
	public String getName() {
		return name;
	}
	public void setName(String x) {
		name = x;
	}
	public void play() {
		System.out.println("Kucing bermain bola");
	}
	public void eat() {
		System.out.println("Kucing makan ikan");
	}
}
