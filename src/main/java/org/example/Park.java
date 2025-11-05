package org.example;

class Park {
    private Attraction[] attractions;

    public Park(int capacity) {
        this.attractions = new Attraction[capacity];
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

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
