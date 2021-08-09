package com.hw2.closes.outerwear;

import com.hw2.closes.person.Status;

import static com.hw2.closes.person.Status.OFF;
import static com.hw2.closes.person.Status.ON;

public class Raincoat implements OuterWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Дождевик надет! Хорошей прогулки");
        } else {
            System.out.println("Дождевик уже надет! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Дождевик снят!");
        } else {
            System.out.println("Вы гуляли без дождевика");
        }
    }
}
