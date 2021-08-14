package com.hw3.rockets;

public interface IStart {

    boolean prelaunchSystemCheck(); //пердстартовая проверка систем

    void engineStarting();//запуск двигателей

    void start(); //старт
}
