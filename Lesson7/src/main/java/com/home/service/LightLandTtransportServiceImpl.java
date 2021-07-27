package com.home.service;

import com.home.enums.TransportType;
import com.home.models.LightLandTtransport;

import com.home.models.Transport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LightLandTtransportServiceImpl implements TransportServiсe {
    public final LightLandTtransport lightLandTtransport;

    @Override
    public void generalMethod() {

    }

    @Override
    public void individualMethod() {
        Transport transport = new Transport(2.0, 120, 2000, "Audi ");
        double time = 3;
        System.out.printf("За время %f часа, автомобиль %s\n" +
                "двигаясь с максимальной скоростью %d км/ч\n " +
                " пройдет %f км и израсходует %f литров топлива.\n", time, transport.getBrand(), transport.getMaxSpeed(), calculatioDistance(lightLandTtransport, time), fuelСonsumption(lightLandTtransport, time));

    }

    //расчет расхода топлива
    public double fuelСonsumption(LightLandTtransport lightLandTtransport, double time) {
        return calculatioDistance(lightLandTtransport, time) * lightLandTtransport.getFuelConsumption() / 100;
    }

    //расчет расстояния, которое пройдет авто за определенное время
    public double calculatioDistance(LightLandTtransport lightLandTtransport, double time) {
        return lightLandTtransport.getMaxSpeed() * time;
    }


}

