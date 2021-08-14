package com.hw3.rockets;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        return random.nextInt(11) > 3;
        // if (number > 3) {
        //   return true;
        //   }
        //  return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатель Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");
    }
}
