package org.example;

public class lesson_2 {
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

//    Park park = new Park();
//    Park.Attraction attraction1 = park.new Attraction(
//            "Wheel",
//            "10:00-18:00",
//            300);
//    attraction1.printInfo();
    }
}

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

class Park {
    class Attraction {
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("аттракцион: " + name + "\nвремя работы: " + workTime + "\nстоимость: " + price);
        }
    }
}