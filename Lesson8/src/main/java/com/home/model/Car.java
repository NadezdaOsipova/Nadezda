package com.home.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private final Engine engine;
    private GasTank gasTank;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
