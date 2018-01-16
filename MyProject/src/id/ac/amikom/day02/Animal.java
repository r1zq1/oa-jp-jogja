package id.ac.amikom.day02;

public abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("Binatang ini berjalan "
				+ "dengan " + legs + " kaki");
	}
	public abstract void eat();
}