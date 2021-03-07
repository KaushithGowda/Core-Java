package com.abc.ioStreams;

import java.io.FileReader;
import java.io.FileWriter;

public class LaunchFilesTryCatch {

	public static void main(String[] args) {

		String path1 = null;
		String path2 = null;
		FileReader fr= null;
		int temp = 0;
		FileWriter fw= null;
		
		try {
			
			path1 = "F:\\Code\\Java\\IO\\Sample\\input.txt";
			path2 = "F:\\Code\\Java\\IO\\Sample\\output.txt";
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			
			while((temp=fr.read()) != -1) {
				fw.write(temp);
			}
			
		} catch(Exception e){
			
			System.out.println("IO operation not done");
		}
		
		finally {	
			
			try {
				fw.close();
				fr.close();
			}
			catch(Exception f) {
				System.out.println("unable to close");
			}
		}
	}

}
