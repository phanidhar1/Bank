package com.nt;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import  junit.framework.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
		int x=10;
		int y=20;
		int expected=30;
		int actual=new App().add(10,20);
		Assert.assertEquals("Result1",expected,actual);
      
    }
}
