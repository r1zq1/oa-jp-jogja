package id.ac.amikom.day04;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		String line = "", fileContent = "";
		try {
			BufferedReader fileInput = 
					new BufferedReader(
							new FileReader(
									new File("D:\\Workspace\\changes.txt")));
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