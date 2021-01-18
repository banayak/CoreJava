package com.java.practice.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:/Java-Write/hello.txt");
		WriteToFile(file);
		readFile(file);
	}

	/**
	 * @param file
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void WriteToFile(File file) throws IOException,
			FileNotFoundException {
		if(!file.isDirectory()){
			file.createNewFile();
		}
		if (!file.exists()) {
		     file.createNewFile();
		  }
		FileOutputStream fileOutputStream =  null;
		try {
			fileOutputStream =  new FileOutputStream(file);
			String mycontent = "This is my Data which needs" +
				     " to be written into the file";
			
			  /*String content cannot be directly written into
			   * a file. It needs to be converted into bytes
			   */
			  byte[] bytesArray = mycontent.getBytes();

			  fileOutputStream.write(bytesArray);
			  fileOutputStream.flush();
			  System.out.println("File Written Successfully");
		} finally{
			fileOutputStream.close();
		}
	}
	
	private static void readFile(File file) throws IOException {


FileInputStream fileInputStream =  new FileInputStream(file);

  int data = fileInputStream.read();
  while(data != -1) {
	  System.out.print((char)data);
      data = fileInputStream.read(); // read next byte
      
  }
  System.out.println("File Read Successfully");
}

}
