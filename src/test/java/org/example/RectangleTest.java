package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea6() {
        Assertions.assertEquals(6, new Rectangle(2,3).getArea());
    }

    @Test
    void getAreaError() {
        Assertions.assertEquals(0, new Rectangle(2,-2).getArea());
    }

    @Test
    void getPerimeter() {
        Assertions.assertEquals(10, new Rectangle(2,3).getPerimeter());
    }
    @Test
    void getPerimeterError() {
        Assertions.assertEquals(0, new Rectangle(-2,3).getPerimeter());
    }
}