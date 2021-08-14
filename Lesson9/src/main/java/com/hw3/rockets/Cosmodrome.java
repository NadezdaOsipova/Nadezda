package com.hw3.rockets;

import lombok.SneakyThrows;

public class Cosmodrome {

    @SneakyThrows
    public void startRocket(IStart rocket) {
        if (!rocket.prelaunchSystemCheck()) {
            System.out.println("Предстартовая проверка провалилась!");
            return;
        }
        rocket.engineStarting();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        rocket.start();
    }
}
