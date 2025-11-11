package org.example.figure;

public class Triangle implements Figure {
    private double side1, side2, side3;
    private String backgroundColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String backgroundColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backgroundColor = backgroundColor;
        this. borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(side1 + side2 + side3);
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.round(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }

    @Override
    public String getFigureName() {
        return "Треугольник";
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

