package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // create instances of Person, Student, and Teacher and access their members
    public static void main(String[] args) {

        Person person = new Person("Alice", 30);
        // person.greet();
        // Output: Hello, my name is Alice and I am 30 years old.

        Student student = new Student("Bob", 20, 12345);
        // student.greet();
        // Output: Hello, my name is Bob and I am 20 years old. My student ID is 12345.

        Teacher teacher = new Teacher("Charlie", 40, 67890);
        // teacher.greet();
        // Output: Hello, my name is Charlie and I am 40 years old.

        // add all Person objects to a list
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(teacher);

        for (Person p : people) {
            p.greet();
        }


//        Person person = new Person();
//        person.name = "Alice";
//        person.age = 30;
//        person.printInfo();
//
//        Student student = new Student();
//        student.name = "Bob";
//        student.age = 20;
//        student.studentId = 12345;
//        student.printInfo();
//
//        Teacher teacher = new Teacher();
//        teacher.name = "Charlie";
//        teacher.age = 40;
//        teacher.teacherId = 67890;
//        teacher.printInfo();
    }
}