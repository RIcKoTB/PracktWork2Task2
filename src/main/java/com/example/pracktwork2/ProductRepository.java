package com.example.pracktwork2;


import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
        // Додаємо 5 будь-яких товарів при старті
        products.add(new Product(1, "Product1", 10.0));
        products.add(new Product(2, "Product2", 20.0));
        products.add(new Product(3, "Product3", 30.0));
        products.add(new Product(4, "Product4", 40.0));
        products.add(new Product(5, "Product5", 50.0));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
