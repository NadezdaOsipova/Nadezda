package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engine {
    private final String typeEngine;//тип двигателя
    private final double volumeEngine;//рабочий объем двигателя
    private boolean isRuning;//

    public Engine(String typeEngine, double volumeEngine) {
        this.typeEngine = typeEngine;
        this.volumeEngine = volumeEngine;
    }
}

