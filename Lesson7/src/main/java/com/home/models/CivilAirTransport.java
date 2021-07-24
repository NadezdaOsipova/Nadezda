package com.home.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CivilAirTransport extends AirTransport { //гражданский воздушный транспорт, наследуется от AirTransport
    private String numberPassengers; //количество пассажиров
    private boolean businessClass; //наличие бизнес класса

    public CivilAirTransport(double power, double maxSpeed, double weight, String brand, double wingSpan, double minLength, String numberPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingSpan, minLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return super.toString() +
                " CivilAirTransport{" +
                "numberPassengers='" + numberPassengers + '\'' +
                ", businessClass=" + businessClass +
                '}';
    }
}
