package id.ac.amikom.day04;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path[] p = new Path[5];
		p[0] = Paths.get("D:\\Workspace\\changes.txt");
		p[1] = Paths.get("D:/Workspace/changes.txt");
		p[2] = Paths.get("D:", "Workspace", "changes.txt");
		p[3] = Paths.get("changes.txt");
		p[4] = Paths.get(URI.create("file:///~/changes.txt"));
		System.out.println("Default File Path p[0] [" + p[0] + "]");
		System.out.println("Default File Path p[1] [" + p[1] + "]");
		System.out.println("Default File Path p[2] [" + p[2] + "]");
		System.out.println("Default File Path p[3] [" + p[3] + "]");
		System.out.println("Default File Path p[4] [" + p[4] + "]");
		
		System.out.println(p[0].getFileName());
		System.out.println(p[0].getParent());
		System.out.println(p[0].getNameCount());
		System.out.println(p[0].isAbsolute());
		System.out.println(p[0].toAbsolutePath());
		System.out.println(p[0].toUri());
	} 
}
