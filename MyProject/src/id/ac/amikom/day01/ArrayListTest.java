package id.ac.amikom.day01;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("merah");
		a.add("biru");
		a.add("kuning");
		a.remove(2);
		a.add("hijau");
		a.add(2, "putih");
		System.out.println(a);
	}
}