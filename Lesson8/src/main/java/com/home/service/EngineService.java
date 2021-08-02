package com.home.service;

public interface EngineService {

    void start();//завести двигатель

    void stop();//заглушить двигатель

    boolean isRuning(); //работает ли двигатель
}
