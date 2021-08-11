package com.hw1.service;

import com.hw1.service.Car;

import java.util.Scanner;

public class CarImpl implements Car {
    @Override
    public void startCar() {

    int number = (int) (Math.random()*21);
        if (number % 2 == 0) {

        } else {
            System.out.println();
        }
    }
}

