package com.abc.deserializationTransicent;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//importing cricketer class from serializable package
import com.abc.serializationTransicent.Cricketer;

public class Destination {

	public static void main(String[] args) throws Exception {

		String path = "F:\\Code\\Java\\txt-Files\\serializeable\\sample\\CricketerTransicent.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Cricketer c=(Cricketer)ois.readObject();
		c.disp();
	}

}
