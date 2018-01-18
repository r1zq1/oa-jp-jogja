package id.ac.amikom.day04;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ServerSocketTest {
	public static void main(String[] args) {
		try {
			java.net.ServerSocket ss = new java.net.ServerSocket(5432);
			System.out.println("Server started ...");
			while(true) {
				Socket s = ss.accept();
				System.out.println("client connect ... ");
				System.out.println("Socket created ...");
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("Hello from Server " + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}