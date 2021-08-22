package com.home.service;

import com.home.models.CivilAirTransport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//подключаем конструктор
public class CivilAirTransportServiceImpl implements TransportServiсe {
    private final CivilAirTransport civilAirTransport;//создаем пассажирский самолет

    //метод, проверяющий вместимость самолета
    @Override
    public void individualMethod() {
        int people = 0;
        if (people <= civilAirTransport.getNumberPassengers()) {
            System.out.println("Самолет загружен!");
        } else {
            System.out.println("Вместимость самолета не рассчитана на такое количество людей! Нужен самолет побольше!");
        }
    }
}





