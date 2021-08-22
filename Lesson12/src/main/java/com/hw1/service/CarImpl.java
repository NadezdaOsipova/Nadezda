package com.hw1.service;

import com.hw1.exception.MyException;
import com.hw1.service.Car;

import java.util.Scanner;

public class CarImpl implements Car {
    private String brand;
    private double maxSpeed;
    private double price;

    public CarImpl(String brand, int i, int i1) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public CarImpl() {
    }

    @Override
    public void startCar() throws MyException {
        int number = (int) (Math.random() * 21);
        if (brand != null || maxSpeed != 0 || price != 0) {
            if (number % 2 == 0) {
                throw new MyException("Автомобиль " + brand + " не заводится!");
            } else {
                System.out.println("Автомобиль " + brand + " завелся!");
            }
        } else {
            throw new IllegalArgumentException("Введенные данные не корректны!");
        }
    }
}

