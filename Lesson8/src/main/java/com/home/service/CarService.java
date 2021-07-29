package com.home.service;

public interface CarService {
    void go(); //машина поехала
    void stop(); //машина остановилась
    void startEngine(); //завести двигатель
    void stopEngine(); //заглушить двигатель
    boolean isMoving();// машина движется
    void refuelСar(); //дозаправить машину
}
