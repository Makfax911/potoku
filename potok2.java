package com.company;

public class potok2 implements Runnable {


    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("world");
    }
}
