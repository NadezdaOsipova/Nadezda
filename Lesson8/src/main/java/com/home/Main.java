package com.home;

import com.home.model.Car;
import com.home.model.Engine;
import com.home.model.GasTank;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("GasEngine", 2.0);
        GasTank gasTank = new GasTank(60);
        Car car = new Car(engine);
        car.setGasTank(gasTank);
    }
}
