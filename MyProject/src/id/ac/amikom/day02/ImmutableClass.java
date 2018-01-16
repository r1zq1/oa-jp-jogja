package id.ac.amikom.day02;

public final class ImmutableClass {
	private static final ImmutableClass 
		instance = new ImmutableClass();
	private ImmutableClass() {
	}
	public static ImmutableClass getInstance() {
		return instance;
	}
}
