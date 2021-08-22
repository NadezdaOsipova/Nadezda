package com.home;

import com.home.model.Product;
import com.home.model.Shop;
import com.home.service.ShopService;
import com.home.service.ShopServiceImpl;
import com.home.utils.MyUtils;

import static com.home.utils.MyUtils.*;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopService service = new ShopServiceImpl(shop);

        System.out.println("1" + service.getAllProducts());
        Product product1 = new Product(1, 2, "хлеб");
        Product product2 = new Product(25, 5, "масло");
        Product product3 = new Product(36, 3, "молоко");
        Product product4 = new Product(25, 12, "торт");
        try {
            service.addProduct(product1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.addProduct(product2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.addProduct(product3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.addProduct(product4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("2" + service.getAllProducts());
        service.deleteProduct(25);
        service.deleteProduct(100);
        System.out.println("3" + service.getAllProducts());
        Product product = service.getProductВуId(1);// ищем продукт, который будем редактировать
        product.setName(readStringFromConsole("Введите новое название товара: "));
        product.setPrice(readIntFromConsole("Введите новую цену товара: ", 150));
        service.editProduct(product);
        System.out.println("4" + service.getAllProducts());
        System.out.println("By creation" + service.getSortedByData());

    }
}
