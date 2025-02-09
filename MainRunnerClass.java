package com;

import java.io.File;

class MainRunnerClass {
	public static void main(String[] args) {
		File f=new File("vehicle");
		if(f.exists())
		{
			f.delete();
			System.out.println("File / folder deleted");
		}
		else
		{
			System.out.println("File/ folder not present");
		}
	}

}
