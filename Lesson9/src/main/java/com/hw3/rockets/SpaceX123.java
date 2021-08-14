package com.hw3.rockets;

import java.util.Random;

public class SpaceX123 implements IStart{
    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return  random.nextInt(11)>3;
           }

    @Override
    public void engineStarting() {
        System.out.println("Двигатель SpaceX123 запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX123.");
    }
}
