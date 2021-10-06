package com.msl.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			createFileUsingFileClass();
			createFileUsingFileOutputStream();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void createFileUsingFileClass() throws IOException {
		
		File file = new File("/home/msrilathagmail/eclipse-workspace/FileIODemo/src/test.txt");
		if(file.createNewFile()) {
			System.out.println("File created");
			
		}else {
			System.out.println("File already exists");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("test data ");
		writer.close();
	}
	
	public static void createFileUsingFileOutputStream() throws IOException {
		
		String data = "data wewewe" ;
		
		FileOutputStream out = new FileOutputStream("/home/msrilathagmail/eclipse-workspace/FileIODemo/src/test2.txt");
		out.write(data.getBytes());
		out.close();
		
	}
	

}
