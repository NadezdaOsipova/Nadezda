package com.home.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop {
    private List<Product> productList;

    public List<Product> getProductList() {
        if (productList == null) {
            productList = new ArrayList<>();
        }
        return productList;
    }
}
