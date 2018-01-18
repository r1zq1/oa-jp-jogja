package id.ac.amikom.day04;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FileIO {
	public static void main(String[] args) {
		String fileContent = "";
		fileContent = readFile();
		if (fileContent.length() > 0) {
			writeFile(fileContent);
			System.out.println(fileContent);
		} else {
			System.out.println("File has no contents");
		}
	}
	public static void writeFile(String fileContent) {
		Path p = Paths.get("C:/BlueJ/OutputFile.txt");
		try {
			BufferedWriter bw = Files.newBufferedWriter(p, Charset.forName("ISO-8859-1"), StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			bw.write(fileContent, 0, fileContent.length());
			bw.close();
		} catch (IOException ioe) {
			System.out.println("Error reading file.");
			System.exit(0);
		} 
	}
	public static String readFile() {
		String line = "", fileContent = "";
		Path p = Paths.get("C:/BlueJ/Fellowship.txt");
		try {
			BufferedReader fileInput = Files.newBufferedReader(p, Charset.forName("ISO-8859-1"));
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
		return fileContent;
	}
}
