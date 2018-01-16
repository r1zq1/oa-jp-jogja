package id.ac.amikom.day01;

public class ArrayTest {
	public static void main(String[] args) {
		// 1. declaration
		int []a1,b1,c1;
		int a2[],b2,c2;
		
		// 2. instantiation
		a1 = new int[4];
		
		// 3. initialization
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		
		// for biasa
		for (int i = 0; i < a1.length; i++) {
			a1[i] = 100 * (i+1);
			System.out.println(a1[i]);
		}
		
		// enhanced for loop (for-each)
		for(int x : a1) {
			System.out.println(x);
		}
		
		// alternative lain untuk membuat array:
		int a [] = {10,20,30,40};
		
		// ukuran array tidak dapat di-re-size
		a2 = new int[8];
		
	}
}