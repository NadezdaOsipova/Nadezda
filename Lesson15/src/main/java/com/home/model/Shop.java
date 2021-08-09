package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Shop {
    private List<Product> productList; //список товаров

    public Shop() {

    }

    public List<Product> Products() { //
        if (productList == null) {
            productList = new ArrayList<>();
        }
        return productList;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "productList='" + productList + '\'' +
                '}';
    }
}
