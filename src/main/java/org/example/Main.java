package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Puszek", "dachshund");
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());

        Dog dogNew = new Dog();
        dogNew.setName("Okruszek");
        dogNew.setBreed("wolfhound");
        System.out.println("Name: " + dogNew.getName());
        System.out.println("Breed: " + dogNew.getBreed());

    }
}