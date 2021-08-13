package com.hw2.clothes.person;

import lombok.Getter;

@Getter
public enum Names {
    MAKSIM("Максим"), ALEXEY("Алексей"), ARTUR("Артур"), KONSTANTIN("Константин");

    public final String name;

    //конструктор
    Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
