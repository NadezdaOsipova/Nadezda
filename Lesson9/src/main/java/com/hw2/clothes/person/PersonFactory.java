package com.hw2.clothes.person;

import java.util.ArrayList;

import com.hw2.clothes.outerwear.Jacket;
import com.hw2.clothes.outerwear.OuterWear;
import com.hw2.clothes.outerwear.Raincoat;
import com.hw2.clothes.outerwear.Topcoat;
import com.hw2.clothes.shoes.Boots;
import com.hw2.clothes.shoes.Sandals;
import com.hw2.clothes.shoes.Shoes;
import com.hw2.clothes.shoes.Sneakers;
import com.hw2.clothes.trousers.Shorts;
import com.hw2.clothes.trousers.Trousers;
import com.hw2.clothes.trousers.Trousers1;
import com.hw2.clothes.person.Сlothes;

public class PersonFactory {

    private static int n;

    public Person createPerson() {
        int numberName = n % Names.values().length;
        String personName = Names.values()[numberName].toString();
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();  //проблема со списком
        clothesArrayList.add(choseOuterWear(n));
        clothesArrayList.add(choesShoes(n));
        clothesArrayList.add(choesTrousers(n));


        return null;
    }

    private OuterWear choseOuterWear(int itemChoice) {
        switch (itemChoice % OuterWear.TYPES) {
            case 0:
                return new Jacket();
            case 1:
                return new Raincoat();
            case 2:
                return new Topcoat();
            default:
                throw new IllegalStateException("Неожиданное значение:" + itemChoice % OuterWear.TYPES);
        }
    }

    private Shoes choesShoes(int itemChoice) {
        switch (itemChoice % Shoes.TYPES) {
            case 0:
                return new Boots();
            case 1:
                return new Sandals();
            case 2:
                return new Sneakers();
            default:
                throw new IllegalStateException("Неожиданное значение:" + itemChoice % Shoes.TYPES);
        }
    }

    private Trousers choesTrousers(int itemChoice) {
        switch (itemChoice % Trousers.TYPES) {
            case 0:
                return new Shorts();
            case 1:
                return new Trousers1();
            default:
                throw new IllegalStateException("Неожиданное значение:" + itemChoice % Trousers.TYPES);
        }
    }

}
