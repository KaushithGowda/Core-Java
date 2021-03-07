package com.abc.ioStreams;

import java.io.File;

public class LaunchFilesFolderCheck {

	public static void main(String[] args) {

		String path = "F:\\Code\\Java\\IO\\Sample\\input.txt";
//		String path = "F:\\Code\\Java\\IO\\Sample";
//		String path = "Z:\\io";
		File f = new File(path);
		
		if(f.exists()==true)
		{
			if(f.isFile()==true) {
				System.out.println("it is file");
			} else {
				System.out.println("it is folder");
			}
		} else {
			System.out.println("invalid path");
		}
		
	}
}
