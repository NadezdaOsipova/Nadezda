package com.home.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MilitaryAirTransport extends AirTransport {//военный воздушный транспорт, наследуется от AirTransport
    public boolean ejectionSystem; // наличие системы катапультирования
    public int numberMissiles; // количество ракет на борту

    public MilitaryAirTransport(double power, double maxSpeed, double weight, String brand, double wingSpan, double minLength, boolean ejectionSystem, int numberMissiles) {
        super(power, maxSpeed, weight, brand, wingSpan, minLength);
        this.ejectionSystem = ejectionSystem;
        this.numberMissiles = numberMissiles;
    }

    @Override
    public String toString() {
        return super.toString() +
                " MilitaryAirTransport{" +
                "ejectionSystem=" + ejectionSystem +
                ", numberMissiles=" + numberMissiles +
                '}';
    }
}
