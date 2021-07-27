package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GasTank {
    private final double volumeGasTank; //общий объем бензобака
    private double leveGasoline; //уровень бензина в баке

    //создаем конструктор только для объема бензобака, тк он final
    public GasTank(double volumeGasTank) {
        this.volumeGasTank = volumeGasTank;
    }
}

