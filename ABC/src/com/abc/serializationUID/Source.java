package com.abc.serializationUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Source {

	public static void main(String[] args) throws Exception{

		String path = "F:\\Code\\Java\\txt-Files\\serializeable\\sample\\CricketerUID.txt";
		FileOutputStream fos = new FileOutputStream(path);
		//crasher
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Cricketer c = new Cricketer("sachin",248,55.6f,78.6f);
		//writing on hdd
		oos.writeObject(c);
		//displaying the object
		c.disp();
	}

}
