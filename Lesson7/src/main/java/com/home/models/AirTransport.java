package com.home.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AirTransport extends Transport { //воздушный транспорт, который наследуется от класса Transport
    private double wingSpan;//размах крыльев
    private double minLength;//Минимальная длина взлётно-посадочной полосы для взлёта

    public AirTransport(double power, double maxSpeed, double weight, String brand, double wingSpan, double minLength) {
        super(power, maxSpeed, weight, brand);
        this.wingSpan = wingSpan;
        this.minLength = minLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                " AirTransport{" +
                "wingSpan=" + wingSpan +
                ", minLength=" + minLength +
                '}';
    }
}
