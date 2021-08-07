package com.home.service;

public interface GasTankService {

    boolean emptyGasTank(); //пустой ли бак (boolean)

    double fuelLevel(); //уровень топлива

    double capacityTank();//вместимость бака

    double fuelLevel(double refuelVolume); //дозаправка больше положенного

    double refuelGasTank(); //дозаправить бензобак

}
