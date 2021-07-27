package com.home.models;

import com.home.enums.TransportType;
import lombok.Getter;
import lombok.Setter;

import static com.home.enums.TransportType.CIVIL;

@Getter
@Setter
public class CivilAirTransport extends AirTransport { //гражданский воздушный транспорт, наследуется от AirTransport
    private int numberPassengers; //количество пассажиров
    private boolean businessClass; //наличие бизнес класса

    public CivilAirTransport(double power, double maxSpeed, double weight, String brand, double wingSpan, double minLength, int numberPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingSpan, minLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public TransportType getType() {
        return CIVIL;
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
