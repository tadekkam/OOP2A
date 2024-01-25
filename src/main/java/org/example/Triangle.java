package org.example;

public class Triangle extends Shape {

    double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isTriangle() {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    @java.lang.Override
    public double getArea() {
        boolean isTriangle = isTriangle();
        if (isTriangle) {
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }
        return 0;
    }

    @java.lang.Override
    public double getPerimeter() {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            return sideA + sideB + sideC;
        }
        return 0;
    }
}
