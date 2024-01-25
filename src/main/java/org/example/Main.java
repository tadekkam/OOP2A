package org.example;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Circle circle = new Circle(5);

        System.out.println("square area " + square.getArea());
        System.out.println("square perimeter " + square.getPerimeter());

        System.out.println("circle area " + circle.getArea());
        System.out.println("circle perimeter " + circle.getPerimeter());

    }
}