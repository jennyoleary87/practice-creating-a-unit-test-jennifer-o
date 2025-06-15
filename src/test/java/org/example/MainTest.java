package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMainPositive() {
        Main person = new Main("Ashley Cole", 32);
        String realName = person.getName();
        int realAge = person.getAge();
        assertEquals("Ashley Cole", realName);
        assertEquals(32, realAge);
    }

    @Test
    public void testEmptyName() {
        Main person = new Main("", 74);
        String realName = person.getName();
        int realAge = person.getAge();
        assertEquals("", realName);
        assertEquals(74, realAge);
    }

    @Test
    public void testIsAdult() {
        Main adult = new Main("Emily Shelton", 18);
        assertTrue(adult.isAdult());

        Main notAdult = new Main("Celia Staley", 17);
        assertFalse(notAdult.isAdult());
    }

}
