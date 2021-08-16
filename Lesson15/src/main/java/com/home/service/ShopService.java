package com.home.service;

import com.home.model.Product;

import java.util.List;

public interface ShopService {

    void addProduct(Product product);// сохраняем товар

    List<Product> getAllProducts();//возвращаем список

    void editProduct(Product product); // редакстируем товар

    void deleteProduct(int id);
}
