package org.example;


class Square extends Rectangle {

    public Square(double sideA) {
        super(sideA);
    }

    @java.lang.Override
    public double getArea() {
        if (sideA > 0) {
            return sqr(sideA);
        }
        return 0;
    }

    @java.lang.Override
    public double getPerimeter() {
        if (sideA > 0) {
            return 4 * sideA;
        }
        return 0;
    }
}
