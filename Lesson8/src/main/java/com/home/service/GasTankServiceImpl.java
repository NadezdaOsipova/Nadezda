package com.home.service;

import com.home.model.GasTank;

import static com.home.utils.EndingComputation.getEndingComputationCurrentLevel;

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
        double refuelVolume = gasTank.getVolumeGasTank() - gasTank.getLevelGasoline();//узнаем сколько топлива израсходовано
        gasTank.setLevelGasoline(gasTank.getVolumeGasTank());//назначаем уровень топлива до полного бака
        return refuelVolume;//значение израсходованного топлива
    }

    //если хотят заправить больше вестимости бака.
    @Override
    public double fuelLevel(double refuelVolume) {
        double emptyVolume = capacityTank() - fuelLevel();//свободное место в баке
        double result = 0; //результат
        if (refuelVolume > emptyVolume) {
            System.out.println("В бак возможно залить лишь " + emptyVolume + "литр" + getEndingComputationCurrentLevel(emptyVolume) + ", а Вы хотите залить " + refuelVolume + "литр" + getEndingComputationCurrentLevel(refuelVolume));
        } else {
            gasTank.setLevelGasoline(fuelLevel() + refuelVolume);
            result = refuelVolume;
        }
        return result;
    }
}

