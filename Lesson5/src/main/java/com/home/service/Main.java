package com.home.service;

import com.home.model.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.toString());
        for (int i = 3; i >= 0; i--) {
            computer.on();
        }
    }

}


