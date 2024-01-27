package org.example;

public class Square implements Shape {

    private final double sideA;
    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        if (sideA > 0) {
            return sideA * sideA;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (sideA > 0) {
            return 4 * sideA;
        }
        return 0;
    }
}
