package com.home.service;

public interface GasTankService {
    boolean emptyGasTank(); //пустой ли бак (boolean)

    double refuelGasTank(); //дозаправить бензобак

    double fuelLevel(); //уровень топлива

    double capacityTank();//вместимость бака

   // double refuelGasTank(double fuelVolume); //дозаправка больше вместимости бака

}
