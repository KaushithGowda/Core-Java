package com.abc.p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception {

		ServerSocket listenser = new ServerSocket(40000);
		System.out.println("Server is Ready");
		Socket ssoc = listenser.accept();
		//small pipe
		InputStream is = ssoc.getInputStream();
		//big pipe
		DataInputStream dis = new DataInputStream(is);
		//end of one way communication
		//start of two way communication
		OutputStream os = ssoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			//reading using bigger pipe
			String str1 = dis.readUTF();
			System.out.println(str1);
			System.out.println("Enter the Message:: ");
			String str2 = scan.nextLine();
			System.out.print("Client says: ");
			dos.writeUTF(str2);
		}
	}

}
