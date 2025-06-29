package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("2 + 3 should equal 5", 5, 2 + 3);

        assertTrue("5 should be greater than 3", 5 > 3);

        assertFalse("5 is not less than 3", 5 < 3);

        
        Object obj = null;
        assertNull("Object should be null", obj);

        Object notNullObj = new Object();
        assertNotNull("Object should not be null", notNullObj);
    }
}
