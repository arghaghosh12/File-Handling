package com;

import java.io.File;
import java.io.IOException;

class Test {
	public static void main(String[] args) throws Exception {
		//File  f=new File("d:/student.pdf");
		// .txt,.doc,xlsx,.pdf
		File f=new File("student1.txt");
		System.out.println(f.createNewFile());
	}

}
