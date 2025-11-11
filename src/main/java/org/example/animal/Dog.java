package org.example.animal;

public class Dog extends Animal {
    private static int countDog;

    public Dog (String name) {
        super(name);
        countDog++;
    }

    @Override
    void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Собака не может проплыть больше 10 м.");
        }
    }

    public static int getDogCount(){
        return countDog;
    }

    static void printDogCount() {
        System.out.println("Количество собак: " + countDog);
    }
}

