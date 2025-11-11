package org.example.figure;

public class FigureApp {
    public static void main(String[] args) {
    Circle circle = new Circle(5, "Белый", "Черный");
    Square square = new Square(10, "Красный", "Синий");
    Triangle triangle = new Triangle(2, 2, 2, "Зеленый", "Розовый");

    circle.printInfo();
    square.printInfo();
    triangle.printInfo();
    }
}
