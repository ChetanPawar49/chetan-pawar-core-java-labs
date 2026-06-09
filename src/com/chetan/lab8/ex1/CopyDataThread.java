package com.chetan.lab8.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	private FileInputStream fis;
	private FileOutputStream fos;
	
	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		this.fis = fis;
		this.fos = fos;
	}
	
	public void run() {
		try {
			int ch;
			int count = 0;
			
			while((ch = fis.read()) != -1) {
				fos.write(ch);
				count++;
				
				if(count % 10 == 0) {
					System.out.println("10 characters are copied");
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
			
			System.out.println("File copied successfully");
		} catch (IOException e) {
			System.out.println(e);;
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
