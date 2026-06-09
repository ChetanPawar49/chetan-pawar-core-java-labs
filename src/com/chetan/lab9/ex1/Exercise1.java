package com.chetan.lab9.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt");

            ExecutorService executor = Executors.newSingleThreadExecutor();

            executor.submit(new CopyDataTask(fis, fos));
            executor.shutdown();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}