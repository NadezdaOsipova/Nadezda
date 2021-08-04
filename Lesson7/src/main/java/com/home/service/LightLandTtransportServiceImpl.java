package com.home.service;

import com.home.models.LightLandTtransport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LightLandTtransportServiceImpl implements TransportServiсe {

    public final LightLandTtransport lightLandTtransport;

    public LightLandTtransportServiceImpl(LightLandTtransport lightLandTtransport) {
        this.lightLandTtransport = lightLandTtransport;
    }

    @Override
    public void individualMethod() {
        double time = 3;
        System.out.println("За время " + time + " часа, автомобиль " + lightLandTtransport.getBrand() + "двигаясь с максимальной скоростью " + lightLandTtransport.getMaxSpeed() + " пройдет " + calculationdistance(lightLandTtransport, time) + " и израсходует " + fuelСonsumption(lightLandTtransport, time) + " литров бензина" );
//        System.out.printf("За время %f часа, автомобиль %s\n" +
//                "двигаясь с максимальной скоростью %d км/ч\n " +
//                " пройдет %f км и израсходует %f литров топлива.\n", time, lightLandTtransport.getBrand(), lightLandTtransport.getMaxSpeed(), calculationdistance(lightLandTtransport, time), fuelСonsumption(lightLandTtransport, time));
    }

    //расчет расхода топлива
    public double fuelСonsumption(LightLandTtransport lightLandTtransport, double time) {
        return calculationdistance(lightLandTtransport, time) * lightLandTtransport.getFuelConsumption() / 100;
    }

    public double calculationdistance(LightLandTtransport lightLandTtransport, double time) {
        return lightLandTtransport.getMaxSpeed() * time;
    }


}

