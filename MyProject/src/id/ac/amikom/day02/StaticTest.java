package id.ac.amikom.day02;

class Person {
	String name;
	static String address;
}
public class StaticTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "Andi";
		p1.address = "Sleman";
		p2.name = "Budi";
		p2.address = "Gunung Kidul";
		Person.address = "Bantul";
		System.out.println(p1.name + " " + p1.address);
		System.out.println(p2.name + " " + p2.address);
	}
}
