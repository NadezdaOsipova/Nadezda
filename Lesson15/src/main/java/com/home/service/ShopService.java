package com.home.service;

import com.home.model.Product;

public interface ShopService {

    void addProduct(Product product);  //принимает объект товара и добавляет его в список

    void productList(); //метод возвращает список всех товаров в магазине

    void deleteProduct(); //метод принимает id товара и удаляет из списка товар с сообветствующим id

    void editingProduct(); //метод принимает  объект товара и редактирует список товаров

}
