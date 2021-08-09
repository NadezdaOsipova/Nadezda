package com.home;

import com.home.model.Product;
import com.home.model.Shop;

import java.awt.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Shop shop = new Shop();
    }

    private static void list() {
        List<Product> list = List.of(
                Product.builder().id(1).name("хлеб").price(2).build(),
                Product.builder().id(2).name("молоко").price(2).build(),
                Product.builder().id(3).name("творог").price(5).build(),
                Product.builder().id(4).name("печенье").price(7).build(),
                Product.builder().id(5).name("кофе").price(23).build()
        );
    }


}
