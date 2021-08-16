package com.home;

import com.home.model.Product;
import com.home.model.Shop;
import com.home.service.ShopService;
import com.home.service.ShopServiceImpl;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopService service = new ShopServiceImpl(shop);

        System.out.println("1"+service.getAllProducts());
        Product product1 = new Product(1, 2,"хлеб");
        Product product2 = new Product(25, 2,"хлеб");
        Product product3 = new Product(36, 2,"хлеб");
        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);

        System.out.println("2"+service.getAllProducts());
        service.deleteProduct(25);
        service.deleteProduct(100);


    }
}
