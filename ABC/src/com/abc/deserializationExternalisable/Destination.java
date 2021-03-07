package com.abc.deserializationExternalisable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//importing the cricketer class from serilization package
import com.abc.serializationExternalizable.Cricketer;

public class Destination {

	public static void main(String[] args) throws Exception {

		String path = "F:\\Code\\Java\\txt-Files\\serializeable\\sample\\CricketerExternalizable.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Cricketer c=(Cricketer)ois.readObject();
		c.disp();
	}

}
