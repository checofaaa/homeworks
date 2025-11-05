package org.example;

class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String originCountry;
    private int price;
    private boolean status;

    public Product(String name,
                   String productionDate,
                   String manufacturer,
                   String originCountry,
                   int price,
                   boolean status) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("название: " + name +
                "\nдата производства: " + productionDate +
                "\nпроизводитель: " + manufacturer +
                "\nстрана происхождения: " + originCountry +
                "\nцена: " + price +
                "\nсостояние бронирования покупателем: " + status);
    }
}
