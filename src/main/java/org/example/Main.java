package org.example;

public class Main {
    public static void main(String[] args) {

        WindowMessage windowMessage = new WindowMessage();
        ConsoleMessage consoleMessage = new ConsoleMessage();

        System.out.println(windowMessage.getMessage());
        System.out.println(consoleMessage.getMessage());

    }
}