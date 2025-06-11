package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void StudentManager() {
    manager =new

    StudentManager();

    Student addedStudent = manager.findStudentByName("John Doe");

    assertEquals("John Doe",addedStudent.getName());

    assertEquals(85.5,addedStudent.getGrade());

    assertEquals(2,addedStudent.getDaysAbsent());
}

}
