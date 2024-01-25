package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea6() {
        Assertions.assertEquals(6, new Triangle(3,4, 5).getArea());
    }
    @Test
    void getAreaError() {
        Assertions.assertEquals(0, new Triangle(2, 7, 14).getArea());
    }

    @Test
    void getPerimeter12() {
        Assertions.assertEquals(12, new Triangle(3,4, 5).getPerimeter());
    }
    @Test
    void getPerimeterError() {
        Assertions.assertEquals(0, new Triangle(1, 2, 0).getPerimeter());
    }


}