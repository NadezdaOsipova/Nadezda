package com.home;

import com.home.models.*;
import com.home.service.TransportService;
import com.home.service.TransportServiсe;

import java.util.ArrayList;
import java.util.List;

public class HomeWork7 {
    private static List<Transport> transportList = listOfTransport();

    public static void main(String[] args) {
        TransportService transportService = new TransportService();
        for (Transport transport : transportList) {
            TransportServiсe transportServiсe = transportService.createService(transport);
            System.out.println(transport.toString());
            transportServiсe.individualMethod();
        }
    }

    private static List<Transport> listOfTransport() {
        List<Transport> transportList = new ArrayList<>();
        transportList.add(CivilAirTransport.builder()
                .brand("British Aerospace")
                .power(100d)
                .maxSpeed(500d)
                .weight(10d)
                .brand("British Aerospace")
                .minLength(20d)
                .wingSpan(15.7d)
                .numberPassengers(100)
                .businessClass(true)
                .build());

        transportList.add(MilitaryAirTransport.builder()
                .brand("MIG")
                .power(7500d)
                .maxSpeed(2500d)
                .weight(7500d)
                .minLength(20d)
                .wingSpan(15.7d)
                .wingSpan(18d)
                .minLength(30d)
                .ejectionSystem(true)
                .numberMissiles(15)
                .build());

        transportList.add(LightLandTtransport.builder()
                .brand("BMW")
                .power(100d)
                .maxSpeed(250d)
                .weight(2000d)
                .numberWheels(4)
                .fuelConsumption(8d)
                .bodyType("Хэтчбек")
                .numberPassengers(4)
                .build());
        transportList.add(FleightLandTransport.builder()
                .brand("Камаз")
                .power(400d)
                .maxSpeed(2000d)
                .weight(4000d)
                .numberWheels(12)
                .fuelConsumption(80d)
                .carryingCapacity(240000d)
                .build());
        return transportList;
    }
}

