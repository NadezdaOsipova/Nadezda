package com.home.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public abstract class LandTransport extends Transport { // наземный траспорт, наследуется от класса Transport
    private int numberWheels;// количество колес
    private double fuelConsumption;// Расход топлива(л/100км)


    public LandTransport(double power, double maxSpeed, double weight, String brand) {
        super(power, maxSpeed, weight, brand);
    }

    @Override
    public String toString() {
        return super.toString() +
                " LandTransport{" +
                "numberWheels=" + numberWheels +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}