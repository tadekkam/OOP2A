package org.example;

public class Rectangle extends Shape {

    double sideA;
    double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        this.sideA = sideA;
    }

    public double sqr (double sideA){
        return sideA * sideA;
    }

    @java.lang.Override
    public double getArea() {
        if (sideA > 0 && sideB > 0) {
            return sideA * sideB;
        } else return 0;
    }

    @java.lang.Override
    public double getPerimeter() {
        if (sideA > 0 && sideB > 0) {
            return 2 * sideA + 2 * sideB;
        } else return 0;
    }

}
