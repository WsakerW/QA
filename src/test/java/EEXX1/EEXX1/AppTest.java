package EEXX1.EEXX1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void order_approved() {
    	
    	final String expected = "Accepted";
    	int data = 5;
    	String actual = App.order_number(data);
    	org.junit.Assert.assertEquals(actual, expected);
    }
}


