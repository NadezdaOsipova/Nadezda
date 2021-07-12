package com.home.service;

import com.home.model.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("лрбло", 1.0, 1.0, 3);
        System.out.println(computer.toString());
        for (int i = 3; i >=0 ; i--) {
            computer.on();
        }
//        computer.toString();
//        computer.on();
//        computer.on();
   }
}




