package com.example.pracktwork2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(int productId) {
        cartItems.removeIf(product -> product.getId() == productId);
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
}
