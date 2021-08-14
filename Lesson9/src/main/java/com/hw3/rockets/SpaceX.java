package com.hw3.rockets;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатель SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX.");
    }
}
