package id.ac.amikom.day04;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FileReading2 {
	public static void main(String[] args) {
		String line = "", fileContent = "";
		Path p = Paths.get("D:\\Workspace\\changes.txt");
		try {
			BufferedReader fileInput = Files.newBufferedReader(p, Charset.forName("ISO-8859-1"));
			line = fileInput.readLine();
			fileContent = line + "\n";
			while (line != null) {
				line = fileInput.readLine();
				if (line != null)
					fileContent += line + "\n";
			} 
			fileInput.close();
		} catch (EOFException eofe) {
			System.out.println("No more lines to read.");
			System.exit(0);
		} catch (IOException ioe) {
			System.out.println("Error reading file.");
			System.exit(0);
		} 
		System.out.println(fileContent);
	}
}
