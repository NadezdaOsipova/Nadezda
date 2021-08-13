package com.hw2.clothes.trousers;

import com.hw2.clothes.person.Status;

import static com.hw2.clothes.person.Status.OFF;
import static com.hw2.clothes.person.Status.ON;

public class Trousers1 implements Trousers {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Штаны одеты! Хорошей прогулки");
        } else {
            System.out.println("Штаны уже на вас! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Штаны сняты!");
        } else {
            System.out.println("Вы гуляли без штанов!");
        }
    }
}
