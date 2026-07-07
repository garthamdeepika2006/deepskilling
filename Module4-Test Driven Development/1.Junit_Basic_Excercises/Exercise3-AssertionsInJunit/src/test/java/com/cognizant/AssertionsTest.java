package com.cognizant;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    Assertions demo = new Assertions();

    @Test
    public void testAssertions() {

        // Assert Equals
        assertEquals(5, demo.add(2, 3));

        // Assert True
        assertTrue(demo.isGreater(5, 3));

        // Assert False
        assertFalse(demo.isGreater(2, 5));

        // Assert Null
        assertNull(demo.getNullObject());

        // Assert Not Null
        assertNotNull(demo.getObject());
    }
}