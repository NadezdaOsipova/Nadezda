package com.hw1.service;

import com.hw1.exception.MyException;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarImpl("bmw", 280, 22000);
        Car car2 = new CarImpl("audi", 250, 35000);
        Car car3 = new CarImpl("lada", 180, 10000);
        Car car4 = new CarImpl("opel", 220, 20000);

        Car[] cars = {car1, car2, car3, car4};
        try {
            metod(cars);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void metod(Car[] cars) throws Exception {
        for (Car car : cars) {
            try {
                car.startCar();
            } catch (MyException myException) {
                throw myException;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
