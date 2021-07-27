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
        return gasTank.getLeveGasoline() == 0;
    }

    // метод реализует дозаправку бензобака.
    @Override
    public void refuelGasTank() {
        gasTank.setLeveGasoline(gasTank.getVolumeGasTank());
    }
}

