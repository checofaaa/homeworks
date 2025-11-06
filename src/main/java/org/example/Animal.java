package org.example;

public class Animal {
    private String name;
    private static int count;

    Animal(String name) {
        this.name = name;
        count++;
    }

    void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public void printName() {
        System.out.println("Имя: " + name);
    }

    public String getName() {
        return name;
    }

    public static int getCount(){
        return count;
    }

    public static void printAnimalCount() {
        System.out.println("Количество животных: " + count);
    }
}
