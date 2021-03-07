package com.abc.ioStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LaunchFilesMotor {

	public static void main(String[] args) {

			String path1 = null;
			String path2 = null;
			FileReader fr= null;
			BufferedReader br = null;
			String temp = null;
			BufferedWriter bw = null;
			FileWriter fw= null;
			
			try {
				
				path1 = "F:\\Code\\Java\\IO\\Sample\\input.txt";
				path2 = "F:\\Code\\Java\\IO\\Sample\\output.txt";
				fr = new FileReader(path1);
				br = new BufferedReader(fr);
				fw = new FileWriter(path2);
				bw = new BufferedWriter(fw);
				
				//return type of readLine() :: String 
				//advantage of readLine() :: complete String is pulled at a shot(where as in read() only 2 bytes are pulled)
				while((temp = br.readLine()) != null) {
					bw.write(temp);
				}
				
			} catch(Exception e){
				
				System.out.println("IO operation not done");
			}
			
			finally {	
				
				try {
					//closing motor first
					br.close();
					bw.close();
					fw.close();
					fr.close();
				}
				catch(Exception f) {
					System.out.println("unable to close");
				}
			}
		}
}


