package com.company;

public class potok1 extends Thread {
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
