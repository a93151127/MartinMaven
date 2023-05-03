package com.andrewprogramming;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void failedTest() {

    }

    @Test
    @Ignore
    public void ignoredTest() {
        System.out.println("This test is ignored!");
    }
}
