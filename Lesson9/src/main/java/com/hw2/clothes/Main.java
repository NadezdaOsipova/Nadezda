package com.hw2.clothes;

import com.hw2.clothes.outerwear.OuterWear;
import com.hw2.clothes.shoes.Shoes;
import com.hw2.clothes.trousers.Trousers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ClothesFactory clothesFactory = new ClothesFactory();
        Clothes[] clothes = new Clothes[5];
        for (int i = 0; i < 5; i++) {
            OuterWear outerWear = clothesFactory.choseOuterWear(random.nextInt(3));
            clothes[i] = outerWear;
        }
        for (int i = 0; i < 5; i++) {
            Shoes shoes = clothesFactory.choseShoes(random.nextInt(3));
            clothes[i] = shoes;
        }
        for (int i = 0; i < 5; i++) {
            Trousers trousers = clothesFactory.choseTrousers(random.nextInt(3));
            clothes[i] = trousers;
        }
        for (Clothes clothe:clothes) {
            clothe.putOn();
            clothe.takeOff();
        }
    }
}
