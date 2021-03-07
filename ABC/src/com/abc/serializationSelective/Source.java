package com.abc.serializationSelective;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Source {

	public static void main(String[] args) throws Exception{

		String path = "F:\\Code\\Java\\txt-Files\\serializeable\\sample\\CricketerSelective.txt";
		FileOutputStream fos = new FileOutputStream(path);
		//motor
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//crasher
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		Cricketer c = new Cricketer("sachin",248,55.6f,78.6f);
		//writing on hdd
		oos.writeObject(c);
		//displaying the object
		c.disp();
		bos.flush();
	}

}
