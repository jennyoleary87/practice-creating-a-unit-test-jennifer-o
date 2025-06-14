package org.example;

import java.sql.SQLOutput;

public class Person {
    public String name;
    public int age;
    protected String address; // accessible only from defined and derived classes

    // constructor to initialize members
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to print the persons name and age
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
