package org.example.animal;

public class AnimalApp {
    public static void main(String[] args) {
        //Задание с животными, кошками и собаками
        Cat catPushok = new Cat("Пушок");
        catPushok.printName();
        catPushok.swim(5);

        Animal dogBobik = new Dog("Бобик");
        dogBobik.printName();
        dogBobik.run(20);

        Cat.printCatCount();
        Dog.printDogCount();
        Animal.printAnimalCount();

        System.out.println();

        //Задание с миской
        Bowl catBowl = new Bowl(25);

        Cat[] cats = new Cat[3];
        cats[0] = catPushok;
        cats[1] = new Cat("Беляш");
        cats[2] = new Cat("Тетрис");

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(catBowl, 10);
            cats[i].printCatFullness();
        }

        catBowl.printFood();
    }
}
