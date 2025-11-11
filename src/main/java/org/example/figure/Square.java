package org.example.figure;

public class Square implements Figure {
    private double side;
    private String backgroundColor;
    private String borderColor;

    public Square(double side, String backgroundColor, String borderColor) {
        this.side = side;
        this.backgroundColor = backgroundColor;
        this. borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(4 * side);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.pow(side, 2));
    }

    @Override
    public String getFigureName() {
        return "Квадрат";
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
