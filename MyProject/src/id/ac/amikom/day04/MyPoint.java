package id.ac.amikom.day04;

import java.io.Serializable;

class Z implements Serializable {}
class Z1 {}
public class MyPoint implements Serializable {
	int x;
	transient int y;
	Z z;
	transient Z1 z1;
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		z = new Z();
		z1 = new Z1();
	}
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}	
}