package id.ac.amikom.day01;

public class LoopingTest {
	public static void main(String[] args) {
		// for loop
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// while
		int j = 0;
		while(j < 10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();
		//do while
		int k = 100;
		do {
			System.out.print(k + " ");
		} while (k < 0);
		System.out.println();
	}
}