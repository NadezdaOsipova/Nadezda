package com.home.service;

import com.home.models.FleightLandTransport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FleightLandTransportServiceImpl implements TransportServiсe {
    public final FleightLandTransport fleightLandTransport;

    @Override
    public void individualMethod() {
        double massa = 0;
        if (massa > fleightLandTransport.getCarryingCapacity()) {
            System.out.println("Все не влезет. Возьмите грузовик побольше");
        } else {
            System.out.println("Грузовик загружен!");
        }

    }
}

