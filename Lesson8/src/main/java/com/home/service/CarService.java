package com.home.service;

public interface CarService {

    void info();//информация о машине

    void go(); //машина поехала

    void stop(); //машина остановилась

    void startEngine(); //завести двигатель

    void stopEngine(); //заглушить двигатель

    void currentFuelLevel(); //текущий уровень топлива

    boolean isMoving();// машина в движении

    boolean isEngineRunning();//двигатель работает

    void refuelСar(); //дозаправить машину
}
