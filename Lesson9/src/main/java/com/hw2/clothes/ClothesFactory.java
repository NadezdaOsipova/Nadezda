package com.hw2.clothes;

import com.hw2.clothes.outerwear.*;
import com.hw2.clothes.shoes.*;
import com.hw2.clothes.trousers.*;

public class ClothesFactory {

    public OuterWear choseOuterWear(int choiceOfClothes) {
        switch (choiceOfClothes) {
            case 0:
                return new Jacket();
            case 1:
                return new Raincoat();
            case 2:
                return new Topcoat();
            default:
                throw new IllegalStateException("Неожиданное значение: " + choiceOfClothes % OuterWear.TYPES);
        }
    }

    public Shoes choseShoes(int choiceOfClothes) {
        switch (choiceOfClothes) {
            case 0:
                return new Boots();
            case 1:
                return new Sandals();
            case 2:
                return new Sneakers();
            default:
                throw new IllegalStateException("Неожиданное значение: " + choiceOfClothes % Shoes.TYPES);
        }
    }

    public Trousers choseTrousers(int choiceOfClothes) {
        switch (choiceOfClothes) {
            case 0:
                return new Shorts();
            case 1:
                return new Trousers1();
            default:
                throw new IllegalStateException("Неожиданное значение: " + choiceOfClothes % Shoes.TYPES);
        }
    }
}
