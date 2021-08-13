package com.hw2.clothes.shoes;

import com.hw2.clothes.person.Status;

import static com.hw2.clothes.person.Status.OFF;
import static com.hw2.clothes.person.Status.ON;

public class Sneakers implements Shoes {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Кеды обуты! Хорошей прогулки");
        } else {
            System.out.println("Кеды уже  обуты! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Кеды снят!");
        } else {
            System.out.println("Вы гуляли босиком");
        }
    }
}
