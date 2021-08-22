package com.home.service;

import com.home.model.Engine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EngineServiceImpl implements EngineService {
    private final Engine engine; //создаем двигатель

    //запускаем его и едем в дорожку :)
    @Override
    public void start() {
        if (!engine.isRuning()) {
            this.engine.setRuning(true);
            System.out.println("Двигатель запущен! Можно ехать");
        } else {
            System.out.println("Двигатель давно запущен! Не порть стартер");
        }
    }

    //глушим двигатель и топаем домой
    @Override
    public void stop() {
        if (engine.isRuning()) {
            this.engine.setRuning(false);
            System.out.println("Двигатель заглушен! Иди домой");
        } else {
            System.out.println("Двигатель давно не работает!");
        }
    }

    @Override
    public boolean isRuning() {
        return engine.isRuning();
    }
}

