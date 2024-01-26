package org.example;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius > 0)
            return Math.PI * radius * radius;
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (radius > 0)
            return 2 * Math.PI * radius;
        return 0;
    }
}
