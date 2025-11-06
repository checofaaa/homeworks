package org.example;

public class Cat extends Animal {
    private static int countCat;
    private boolean fullness = false;

    public Cat (String name) {
        super(name);
        countCat++;
    }

    @Override
    void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    static void printCatCount() {
        System.out.println("Количество кошек: " + countCat);
    }

    public static int getCatCount(){
        return countCat;
    }

    public void eat(Bowl bowl, int catWantsFood) {
        if (!fullness) {
            if (bowl.getFood() >= catWantsFood) {
                fullness = true;
                bowl.decreaseFood(catWantsFood);
            } else {
                System.out.println("Кот " + getName() + " хочет слишком много, в миске нет столько еды.");
            }
        } else {
            System.out.println("Кот " + getName() + " уже сыт.");
        }
    }

    public void printCatFullness() {
        if (fullness) {
            System.out.println("Кот " + getName() + " сыт");
        } else {
            System.out.println("Кот " + getName() + " голоден");
        }
    }
}
