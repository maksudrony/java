package com.practice;

import java.io.File;//file read or write korar jonno
import java.io.FileNotFoundException;
import java.io.PrintWriter;//
import java.util.Scanner;// file scan or read korte gele

public class InputOutputDemo {// file create kore write korar jonno;
	public static void main(String[] args) throws FileNotFoundException {
		InputOutputDemo demo = new InputOutputDemo();
		File employeeinfoFile = new File("C:\\JavaFiles\\employeeinfo.txt");
		demo.writeToFile(employeeinfoFile);
		File vehicleinfofile = new File("C:\\JavaFiles\\vehicleinfo.txt");
		demo.readtoFile(vehicleinfofile);

	}

	public void writeToFile(File filetowrite) {
		PrintWriter employeeinfowriter = null; // print writer use kora hoy new txt file a kisu lekhar jonno;
		// printwriter dyeo file create kora jay
		// None of the PrintWriter methods throws IOException, instead they set a
		// boolean flag which can be obtained using checkError().
		// filewriter dyeo file create kora jay..FileWriter throws IOException in case
		// of any IO failure..
		// arekta class create kore filewriter dekhano hoise
		try {

			employeeinfowriter = new PrintWriter(filetowrite);
			employeeinfowriter.println("Rony");// writing into employeeinfo file
			employeeinfowriter.println(500);
		} catch (FileNotFoundException e) {
			System.out.println("file not found " + filetowrite.getName());
			throw new RuntimeException(e);// unchecked exception
		} finally {
			employeeinfowriter.close();
		}
	}

	public void readtoFile(File filetoread) throws FileNotFoundException {
		Scanner sc = new Scanner(filetoread);// file read or scan korar jonno;
		// ekhane sc hoise input type like input is used to read datas from the source
		while (sc.hasNext())// hasNext() is a method of Java Scanner class which returns true if this
							// scanner has another token in its input.
			System.out.println("in the file the inputs are " + sc.nextLine());
		// The nextLine() method of java.util.Scanner class advances this scanner past
		// the current line and returns the input that was skipped.
	}
}
