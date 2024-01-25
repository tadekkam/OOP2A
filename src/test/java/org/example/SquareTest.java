package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

        @Test
        void getArea4() {
            Assertions.assertEquals(4, new Square(2).getArea());
        }

        @Test
        void getAreaError() {
            Assertions.assertEquals(0, new Square(0).getArea());
        }

        @Test
        void getPerimeter2() {
            Assertions.assertEquals(8, new Square(2).getPerimeter());
        }

        @Test
        void getPerimeterError() {
            Assertions.assertEquals(0, new Square(-5).getArea());
        }

}
