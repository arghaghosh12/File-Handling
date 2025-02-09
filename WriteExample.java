package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteExample {
	public static void main(String[] args) throws Exception {
		File f=new File("student.txt");
		FileWriter fw =new FileWriter(f,true);//append true
		//fw.write("How are you");
		fw.write("I am fine");
		fw.flush();
		fw.close();
		System.out.println("Data Stored");
	}

}
