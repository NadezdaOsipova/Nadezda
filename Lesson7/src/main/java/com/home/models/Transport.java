package com.home.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public abstract class Transport implements Transportable {// основной класс от которого наследуются остальные классы
    private double power; // Мощность(в лошадиных силах)
    private double maxSpeed; //Максимальная скорость(км/ч)
    private double weight; //Масса (кг)
    private String brand; //марка

    @Override
    public String toString() {
        return " Transport{" +
                "power=" + getPower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
