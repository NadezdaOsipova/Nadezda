package com.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Avto extends ccccc {
    private  String brand;
    private double maxSpeed;
    private double price;

    @Override
    public String toString() {
        return "com.hw1.model.Avto{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
