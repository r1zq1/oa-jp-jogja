package id.ac.amikom.day02;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a = new Animal();
		Animal as = new Spider();
		as.eat();
		as.walk();
		
		Animal ac = new Cat();
		ac.eat();
		ac.walk();
//		ac.play();
		if(ac instanceof Cat) {
			Cat c = (Cat)ac;
			c.play();
			c.setName("Tom");
			System.out.println(c.getName());
		}
		
//		Pet p = new Pet();
		Pet pf = new Fish();
		pf.play();
		pf.setName("Nemo");
		System.out.println(pf.getName());
//		pf.eat();
		if(pf instanceof Fish) {
			Fish f = (Fish)pf;
			f.eat();
			f.walk();
		}
		
	}
}
