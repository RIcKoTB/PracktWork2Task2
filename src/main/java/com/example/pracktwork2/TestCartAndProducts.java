package com.example.pracktwork2;

public class TestCartAndProducts {
    public static void main(String[] args) {
        // Тести для продемонстрування роботи кошика та продуктів
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();

        // Додаємо товари в кошик за id
        cart.addProduct(productRepository.getProductById(1));
        cart.addProduct(productRepository.getProductById(3));

        // Виводимо список товарів в кошику
        System.out.println("Cart items:");
        for (Product product : cart.getCartItems()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        // Видаляємо товар з кошика за id
        cart.removeProduct(1);

        // Виводимо оновлений список товарів в кошику
        System.out.println("\nUpdated cart items:");
        for (Product product : cart.getCartItems()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
}

