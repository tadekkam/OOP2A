package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextToUpperTest {

    @Test
    void formatText() {
        Assertions.assertEquals("SAMPLE TEXT TO BE CHANGED", new TextToUpper().formatText("Sample TEXT to be changed"));
    }

    @Test
    void formatTextNull() {
        Assertions.assertEquals("", new TextToUpper().formatText(""));
    }
}