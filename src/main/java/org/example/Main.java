package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student grade:");
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter days absent:");
        int daysAbsent = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, grade, daysAbsent);
        students.add(student);

        System.out.println("Student added successfully!");
    }

}