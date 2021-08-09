package com.hw2.closes.shoes;

import com.hw2.closes.person.Status;

import static com.hw2.closes.person.Status.OFF;
import static com.hw2.closes.person.Status.ON;

public class Boots implements Shoes {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Сапоги надеты! Хорошей прогулки");
        } else {
            System.out.println("Сапоги уже надеты! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Вы сняли сапоги!");
        } else {
            System.out.println("Вы гуляли босиком");
        }
    }
}
