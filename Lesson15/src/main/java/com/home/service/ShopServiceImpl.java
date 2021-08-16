package com.home.service;

import com.home.model.Product;
import com.home.model.Shop;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final Shop shop;

    @Override
    public void addProduct(Product product) {
        shop.getProductList().add(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return shop.getProductList();
    }

    @Override
    public void editProduct(Product product) {
              Product sourceProduct = findProductById(product.getId());
        sourceProduct.setName(product.getName());
        sourceProduct.setPrice(product.getPrice());
        System.out.println();

           //   List<Product> list = getAllProducts();
     //   int index = list.indexOf(sourceProduct);

    }

    @Override
    public void deleteProduct(int id) {
        try {
            Product product = findProductById(id);
            List<Product> productList =getAllProducts();
            productList.remove(product);
            System.out.println(product + " deleted");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private Product findProductById(int id) throws NoSuchElementException {
        List<Product> productList = getAllProducts();
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Product with id: " + id + " not found"));

    }
}
