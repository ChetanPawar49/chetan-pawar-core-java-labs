package com.chetan.lab9.ex1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimerTask implements Runnable {

    @Override
    public void run() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {

            System.out.println("Current Time : " + LocalTime.now().format(formatter));

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}