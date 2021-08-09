package com.hw2.closes.person;

import com.hw2.closes.Сlothes;

import java.util.List;


public class Person {
    private String name;//имя человека
    private List<Сlothes> сlothesList;//список вещей, которые одеваем

    //конструктор
    public Person(String name, List<Сlothes> сlothesList) {
        this.name = name;
        this.сlothesList = сlothesList;
    }

    //метод надеться
    public void putOnClothes() {
        for (Сlothes clothes : сlothesList) {
            clothes.putOn();
        }
    }

    //метод снять одежду
    public void undress() {
        for (Сlothes сlothes : сlothesList) {
            сlothes.takeOff();
        }
    }
}
