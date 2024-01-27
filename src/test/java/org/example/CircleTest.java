package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Assertions.assertEquals(78.53981633974483, new Circle(5).getArea());
    }

    @Test
    void getAreaError() {
        Assertions.assertEquals(0, new Circle(0).getArea());
    }

    @Test
    void getPerimeter() {
        Assertions.assertEquals(31.41592653589793, new Circle(5).getPerimeter());
    }

    @Test
    void getPerimeterError() {
        Assertions.assertEquals(0, new Circle(-5).getArea());
    }

}
