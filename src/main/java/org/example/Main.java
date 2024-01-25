package org.example;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 5);
        Triangle triangle = new Triangle(3,4,5);
        Circle circle = new Circle(5);


        System.out.println("square area " + square.getArea());
        System.out.println("square perimeter " + square.getPerimeter());

        System.out.println("rectangle area " + rectangle.getArea());
        System.out.println("rectangle perimeter " + rectangle.getPerimeter());

        System.out.println("triangle area " + triangle.getArea());
        System.out.println("triangle perimeter " + triangle.getPerimeter());

        System.out.println("circle area " + circle.getArea());
        System.out.println("circle perimeter " + circle.getPerimeter());

    }
}