package com.abc.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class LaunchFiles {

	public static void main(String[] args) throws Exception {

		String path1 = "F:\\Code\\Java\\IO\\Sample\\input.txt";
		String path2 = "F:\\Code\\Java\\IO\\Sample\\output.txt";
		
		//from fastest memory device(RAM) side we are accepting input so InputStream 
		//FileInputStream can read 1Byte at one harddisk hit(one knock on hdd)
//		FileInputStream fis = new FileInputStream(path1);
		//bucket
//		int temp;
		//from fastest memory device(RAM) side we are sending output so OutputStream 
//		FileOutputStream fos = new FileOutputStream(path2);
		
		//reading from HDD
//		while( (temp= fis.read()) !=-1) {
			//writing into bucket
			//sending output to HDD
//			fos.write(temp);
//		}

		//FileReader can read 2Bytes at one harddisk hit(one knock on hdd)
		FileReader fr = new FileReader(path1);
		int temp2;
		FileWriter fw = new FileWriter(path2);
		while((temp2=fr.read()) != -1) {
			fw.write(temp2);
		}
		//it uses bufffer(capacity 1024bytes) location to store the byte data 
		//hence we need to either flush() or close the streams to get the data into files
		//it automatically flushes the data when the memory is maxed out
		//fw.flush();
		fw.close();
		fr.close();
	}

}
