package org.example;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @java.lang.Override
    public double getArea() {
        if (radius > 0) {
            return Math.PI * radius * radius;
        } else return 0;
    }

    @java.lang.Override
    public double getPerimeter() {
        if (radius > 0) {
            return 2 * Math.PI * radius;
        } else return 0;
    }
}
