package org.example;

// inheriting name and age from Person
public class Student extends Person{
    public int studentId;

    // add constructor that calls Person constructor
    // call parent using "super"
    public Student(String name, int age, int studentId) {
        super(name, age);
        // super("",6);
        this.studentId = studentId;
        this.address = "123 Main St";
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. My student ID is " + studentId + ".");
    }
}
