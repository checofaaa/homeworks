package org.example;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product(
                "banana",
                "01.11.2025",
                "Andhra Pradesh",
                "India",
                100,
                true);
        product1.printInfo();

        Product[] productsArray = new Product[5];
        productsArray[0] = product1;
        productsArray[1] = new Product("apple", "01.10.2025", "Minsk Fruits", "Belarus", 80, false);
        productsArray[2] = new Product("orange", "10.10.2025", "Sunny Farm", "Spain", 150, true);
        productsArray[3] = new Product("kiwi", "20.10.2025", "Green World", "New Zealand", 200, false);
        productsArray[4] = new Product("watermelon", "03.11.2025", "New World", "Turkey", 300, true);
    }
}
