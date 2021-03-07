package com.abc.p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

		Socket csoc = new Socket("localhost",40000);
		//small pipe
		OutputStream os = csoc.getOutputStream();
		//big pipe
		DataOutputStream dos = new DataOutputStream(os);
		//end of one way communication
		//start of two way communication
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("Enter the Message for Server:: ");
			String str1 = scan.nextLine();
			//writing using bigger pipe
			System.out.println("Server says: ");
			dos.writeUTF(str1);
			String str2 = dis.readUTF();
			System.out.print(str2);
		}
	}

}
