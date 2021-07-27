package com.home.service;

import com.home.models.MilitaryAirTransport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MilitaryAirTransportServiceImpl implements TransportServiсe {
    public final MilitaryAirTransport militaryAirTransport;

    @Override
    public void generalMethod() {
        if (militaryAirTransport.ejectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public void individualMethod() {
        int numberMissiles = militaryAirTransport.getNumberMissiles();
        if (numberMissiles > 0) {
            System.out.println("Ракета пошла...");
            militaryAirTransport.setNumberMissiles(--numberMissiles);
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }
}

