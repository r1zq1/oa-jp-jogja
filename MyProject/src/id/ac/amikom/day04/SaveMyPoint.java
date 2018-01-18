package id.ac.amikom.day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveMyPoint {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		// Serialization
		MyPoint p = new MyPoint(3, 9);
		FileOutputStream fos = new FileOutputStream("mypoint.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		// De-Serialization
		FileInputStream fis = new FileInputStream("mypoint.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		MyPoint obj = (MyPoint)o;
		System.out.println(obj);
	}
}