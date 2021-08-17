package com.home.service;

import com.home.model.Product;

import java.util.List;

public interface ShopService {

    void addProduct(Product product) throws Exception;// сохраняем товар

    List<Product> getAllProducts();//возвращаем список

    void editProduct(Product product); // редакстируем товар

    void deleteProduct(int id);

    Product getProductВуId(int id);
    List<Product> getSortedByData();

}
