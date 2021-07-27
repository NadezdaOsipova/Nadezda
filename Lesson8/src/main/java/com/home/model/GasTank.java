package com.home.model;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class GasTank {
    private final double volumeGasTank; //общий объем бензобака
    private double leveGasoline ; //уровень бензина в баке

//создаем конструктор только для объема бензобака, тк он final
    public GasTank(double volumeGasTank) {
        this.volumeGasTank = volumeGasTank;
    }

    //вывод на печать
    @Override
    public String toString() {
        return "GasTank{" +
                "volumeGasTank=" + volumeGasTank +
                ", leveGasoline=" + leveGasoline +
                '}';
    }
}
