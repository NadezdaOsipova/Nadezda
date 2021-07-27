package com.home.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private final Engine engine;//двигатель, переменная не изменная
    private GasTank gasTank;//бензобак, который можно изменить
    private boolean isMoving; // машина движется

    //создан конструктор Сar c двигателем, тк как он не изменен
    public Car(Engine engine) {
        this.engine = engine;
    }
}
