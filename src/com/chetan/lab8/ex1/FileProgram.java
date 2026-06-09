package com.chetan.lab8.ex1;

import java.io.*;

public class FileProgram {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("source.txt");
			FileOutputStream fos = new FileOutputStream("target.txt");
			
			CopyDataThread thread = new CopyDataThread(fis, fos);
			thread.start();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
