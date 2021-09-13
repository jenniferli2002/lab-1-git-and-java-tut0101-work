/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    @Test(timeout = 10)
    public void testDebnat17(){
        String expected = "Hi! My name is Sujoy Deb Nath! " +
                "I like cats more than dogs! Happy to be here!";
        String actual = IntroLab.debnat17();
        assertEquals(expected, actual);
    }
}
