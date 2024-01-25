package org.example;

public class Main {
    public static void main(String[] args) {

        TextToUpper textToUpper = new TextToUpper();
        TextToLower textToLower = new TextToLower();

        System.out.println(textToUpper.formatText("Sample TEXT to be changed"));
        System.out.println(textToLower.formatText("Sample TEXT to be changed"));
    }
}