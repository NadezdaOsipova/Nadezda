package com.hw2.closes.outerwear;

import com.hw2.closes.person.Status;
import static com.hw2.closes.person.Status.*;

public class Jacket implements OuterWear {
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (status == Status.OFF) {
            status = Status.ON;
            System.out.println("Куртка надета! Хорошей прогулки");
        } else {
            System.out.println("Куртка уже надета! Идите гулять");
        }
    }

    @Override
    public void takeOff() {
        if (status == ON) {
            status = OFF;
            System.out.println("Куртка снята!");
        } else {
            System.out.println("Вы гуляли без куртки");
        }
    }
}

