package com.abc.deserializationUID;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//import com.abc.serializationUID.Cricketer;

public class Destination {

	public static void main(String[] args) throws Exception {

		String path = "F:\\Code\\Java\\txt-Files\\serializeable\\sample\\CricketerUID.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Cricketer c=(Cricketer)ois.readObject();
		c.disp();
	}

}
