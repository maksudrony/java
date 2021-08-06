package com.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {// fileWriter use kora hoise
	public static void main(String[] args) throws IOException {
		FileWriteDemo demo = new FileWriteDemo();
		File bikeinfofile = new File("C:\\JavaFiles\\bikeinfo.txt");
		demo.writetofile(bikeinfofile);
	}

	public void writetofile(File writetofile) throws IOException {
		FileWriter bikeinfowrite = new FileWriter(writetofile);
		bikeinfowrite.write("Ducati");
		bikeinfowrite.flush();
		bikeinfowrite.close();

	}
}