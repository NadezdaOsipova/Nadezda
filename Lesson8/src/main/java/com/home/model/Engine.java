package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //создан конструктор на 2 поля

public class Engine {
    private final String typeEngine;//тип двигателя
    private final double volumeEngine;//рабочий объем двигателя

    @Override
    public String toString() {
        return "Engine{" +
                "typeEngine='" + typeEngine + '\'' +
                ", volumeEngine=" + volumeEngine +
                '}';
    }
}
