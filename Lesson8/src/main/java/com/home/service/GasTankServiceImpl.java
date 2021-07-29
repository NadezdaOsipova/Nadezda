package com.home.service;

import com.home.model.GasTank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GasTankServiceImpl implements GasTankService {
    private final GasTank gasTank; //создаем бак

    // метод проверяет пустой ли бензобак.
    @Override
    public boolean emptyGasTank() {
        return gasTank.getLevelGasoline() == 0;
    }

    //метод возвращает уровень топлива
    @Override
    public double fuelLevel() {
        return gasTank.getLevelGasoline();
    }

    //метод возвращает вместимость бака
    @Override
    public double capacityTank() {
        return gasTank.getVolumeGasTank();
    }

    // метод реализует дозаправку бензобака.
    @Override
    public double refuelGasTank() {
        double refuelVolume = gasTank.getVolumeGasTank() - gasTank.getLevelGasoline();
        gasTank.setLevelGasoline(gasTank.getVolumeGasTank());
        return refuelVolume;
    }

//    //если хотят заправить больше вестимости бака.
//    @Override
//    public double refuelGasTank(double fuelVolume) {
//        double refuelVolume = gasTank.getVolumeGasTank() - gasTank.getLevelGasoline();
//        gasTank.setLevelGasoline(gasTank.getVolumeGasTank());
//        return refuelVolume;
//

}

