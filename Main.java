package com.company;

public class Main {

    public static void main(String[] args) {
	potok1 pro1 = new potok1();
	pro1.start();
	Thread potok2 =new Thread(new potok2());
	potok2.start();
    }
}
