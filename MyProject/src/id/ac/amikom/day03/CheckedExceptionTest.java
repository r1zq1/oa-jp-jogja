package id.ac.amikom.day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionTest {
	public void method1() {
		try {
			FileInputStream fis = new FileInputStream("namafile");
			fis.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Always executed");
		}
	}
	public void method2() {
		method1();
	}
	public void method3() {
		method2();
	}
	public static void main(String[] args) {
		new CheckedExceptionTest().method3();
	}
}
