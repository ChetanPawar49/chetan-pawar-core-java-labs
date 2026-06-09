package com.chetan.lab8.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimerThread implements Runnable {

	@Override
	public void run() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		while(true) {
			System.out.println("Current time: " + LocalTime.now().format(formatter));
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
	
}
