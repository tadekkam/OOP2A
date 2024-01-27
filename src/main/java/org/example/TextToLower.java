package org.example;

public class TextToLower implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
