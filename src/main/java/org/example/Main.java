package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Tadek", "Nowak", 18);
        Person person2 = new Person("Tadek", "Nowak", 18);

        System.out.println("Equals: " + person1.equals(person2));
        System.out.println("HashCode person1: " + person1.hashCode());
        System.out.println("HashCode person2: " + person2.hashCode());

        Person person3 = new Person("Tadek", "Nowak", 18);
        Person person4 = new Person("Tadek", "Nowak", 20);

        System.out.println("Equals: " + person3.equals(person4));
        System.out.println("HashCode person3: " + person3.hashCode());
        System.out.println("HashCode person4: " + person4.hashCode());
    }
}