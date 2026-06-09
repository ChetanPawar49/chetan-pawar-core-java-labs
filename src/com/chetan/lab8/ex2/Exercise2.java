package com.chetan.lab8.ex2;

public class Exercise2 {

	public static void main(String[] args) {
		TimerThread timer = new TimerThread();
		Thread thread = new Thread(timer);
		
		thread.start();
	}

}
