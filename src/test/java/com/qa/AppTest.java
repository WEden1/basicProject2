package com.qa;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app = new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    @Test
    public void isAnswerRight(){
        assertEquals( "Output incorrect", 1, app.method(1, 2) );
    }

    @Test
    public void isTrue(){
        assertTrue("Output should return true", app.method2(true));
    }

    @Test
    public void isFalse(){
        assertFalse("Output should return false", app.method2(false));
    }
    @Test
    public void isSame(){
        assertSame("Output incorrect", 1, app.method(1, 2));
    }

    @Test
    public void isNull() {
        Object obj = null;
        assertNull("Expected: Null Object", obj);
    }
}
