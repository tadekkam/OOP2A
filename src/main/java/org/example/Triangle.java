package org.example;

public class Triangle {
   double width;
   double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
   }
}
