package com.hw2.clothes.outerwear;

import com.hw2.clothes.person.Status;

import static com.hw2.clothes.person.Status.OFF;
import static com.hw2.clothes.person.Status.ON;

public class Topcoat implements OuterWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Пальто надето! Хорошей прогулки");
        } else {
            System.out.println("Пальто уже надето! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Пальто вы уже сняли!");
        } else {
            System.out.println("Вы гуляли без пальто");
        }
    }
}
