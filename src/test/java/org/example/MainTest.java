package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//The test class mirrors the name of the class being tested (with Test at the end)
public class MainTest {
    @Test
    //There is at least one test for the normal (“happy path”) case
    public void testMainPositive() {
        Main person = new Main("Ashley Cole", 32);
        String realName = person.getName();
        int realAge = person.getAge();
        assertEquals("Ashley Cole", realName);
        assertEquals(32, realAge);
    }

    @Test
    //The test method name clearly describes what is being tested
    //The test can run independently and doesn’t rely on other tests
    public void testEmptyName() {
        Main person = new Main("", 74);
        String realName = person.getName();
        int realAge = person.getAge();
        assertEquals("", realName);
        assertEquals(74, realAge);
    }

    @Test
    public void testIsAdult() {
        //There is at least one test for an edge case or unusual input
        //The test uses appropriate assertions to verify behavior
        Main adult = new Main("Emily Shelton", 18);
        assertTrue(adult.isAdult());

        Main notAdult = new Main("Celia Staley", 17);
        assertFalse(notAdult.isAdult());
    }

}

//The test class mirrors the name of the class being tested (with Test at the end)
//The test method name clearly describes what is being tested
//The test can run independently and doesn’t rely on other tests
//There is at least one test for the normal (“happy path”) case
//There is at least one test for an edge case or unusual input
//The test uses appropriate assertions to verify behavior
