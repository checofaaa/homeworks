package org.example.animal;

public class Bowl {
    private int food = 0;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        food += Math.abs(amount);
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    };

    public int getFood() {
        return food;
    }

    public void printFood() {
        System.out.println("В миске осталось еды: " + food);
    }
}
