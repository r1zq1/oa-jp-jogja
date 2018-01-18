package id.ac.amikom.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDeleteDemo {
	public static void main(String[] args) {
		Path p = Paths.get("D:/aaa/bbb/ccc");
		Path p2 = Paths.get("file.txt");
		Path p3 = p.resolve(p2);
		try {
			if (Files.exists(p3)) {
				Files.deleteIfExists(p3);
				System.out.println(p3.toString() + " deleted!");
			} else
				System.out.println(p3.toString() + " not found!");
		} catch (IOException x) {
			System.err.println(x);
		} 
	}
}
