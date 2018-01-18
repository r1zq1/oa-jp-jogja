package id.ac.amikom.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) {
		Path p = Paths.get("D:/aaa/bbb/ccc");
		Path p2 = Paths.get("file.txt");
		Path p3 = p.resolve(p2);
		System.out.println("The contents of p3 : " + p3.toString());
		try {
			if (Files.notExists(p))
				Files.createDirectories(p);
			if (Files.notExists(p3))
				Files.createFile(p3);
		} catch (IOException x) {
			System.err.println(x);
		} 
	}
}