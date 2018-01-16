package id.ac.amikom.day02;

public interface Pet {
	String getName();
	void setName(String n);
	void play();
	default void methodA() {
		
	}
	static void methodB() {
		
	}
}