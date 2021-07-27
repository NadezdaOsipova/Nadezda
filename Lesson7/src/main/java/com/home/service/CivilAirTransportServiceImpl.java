package com.home.service;
import  com.home.models.CivilAirTransport;

public class CivilAirTransportServiceImpl implements TransportServiсe {
   private final CivilAirTransport civilAirTransport;


    public CivilAirTransportServiceImpl(CivilAirTransport civilAirTransport) {
        this.civilAirTransport = civilAirTransport;
    }

    @Override
    public void generalMethod() {

    }

    @Override
    public void individualMethod(int people) {
        if (people <= civilAirTransport.getNumberPassengers()){
            System.out.println( "Самолет загружен!");
        } else {
            System.out.println(" Вместимость самолета не рассчитана на такое количество людей! Нужен самолет побольше!");
        }
    }


}
