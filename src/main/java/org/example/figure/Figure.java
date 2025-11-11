package org.example.figure;

public interface Figure {
    String getFigureName();
    String getBackgroundColor();
    String getBorderColor();

    double calculatePerimeter();
    double calculateArea();

    default void printInfo() {
        System.out.println(
                "Фигура: " + getFigureName() +
                "\nЦвет фона: " + getBackgroundColor() +
                "\nЦвет границы: " + getBorderColor() +
                "\nПериметр: " + calculatePerimeter() +
                "\nПлощадь: " + calculateArea() +
                "\n----------------------"
        );
    }
}
