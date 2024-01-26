package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextToLowerTest {

    @Test
    void formatText() {
        Assertions.assertEquals("sample text to be changed", new TextToLower().formatText("Sample TEXT to be changed"));
    }

    @Test
    void formatTextNull() {
        Assertions.assertEquals("", new TextToLower().formatText(""));
    }

}