package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStreamDemo filedemo = new FileOutputStreamDemo();
		File fileoutputstream = new File("C:\\JavaFiles\\message.txt");
		filedemo.WriteToFile(fileoutputstream);

	}

//private String file;
	private void WriteToFile(File filetowrite) throws IOException {

		FileOutputStream fileoutputstream = new FileOutputStream(filetowrite);
		fileoutputstream.write("hi! i am maksud alam ".getBytes());
		fileoutputstream.close();

	}
}
