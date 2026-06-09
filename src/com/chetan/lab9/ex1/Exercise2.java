package com.chetan.lab9.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(new TimerTask());
        executor.shutdown();
    }
}