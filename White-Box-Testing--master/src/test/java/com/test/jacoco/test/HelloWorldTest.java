package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    /*my code */
    	int b = hw.Method3(4, 0, -3);
    	int c = hw.Method3(6, 0, -3);
    	int d = hw.Method3(4, 0, 0);
    	int e = hw.Method3(4, 0, 3);
    	
    }
    
    @Test
    public void testMethod4() {
    	/**
    	 * my code
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method4(0, 0, 0, 0, 0);
    	int b = hw.Method4(1, 1, 0, 0, 0);
    	int c = hw.Method4(5, 2, 2, 2, 0);
//    	int d = hw.Method4(1, 2, 2, 2, 0);
    }
    
    @Test
    public void testisTriangle() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.isTriangle(1, 1, 5);
    	assertEquals(false, a);
    /*my code */
    	boolean b = hw.isTriangle(1, 3, 3);
    	assertEquals(true, b);
    }
    
    @Test
    public void testisBirthday() throws ParseException 
    {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.isBirthday(1, 1, 5);
    	assertEquals(false, a);
    	boolean b = hw.isBirthday(2018, 1, 5);
    	assertEquals(true, b);
    	boolean c = hw.isBirthday(2020, 1, 5);
    	assertEquals(false, c);
    }
    
    @Test
    public void testminiCalculator()
    {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	double a = hw.miniCalculator(1.0, 1.0, '+');
    	assertEquals(2.0, a, 0.1);
    	double b = hw.miniCalculator(2.0, 1.0, '-');
    	assertEquals(1.0, b, 0.1);
    	double c = hw.miniCalculator(2.0, 1.0, '*');
    	assertEquals(2.0, c, 0.1);
    	double d = hw.miniCalculator(4.0, 2.0, '/');
    	assertEquals(2.0, d, 0.1);
    	double e = hw.miniCalculator(4.0, 2.0, 't');
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testbug() {
    	/**
    	 * my code
    	 */
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.bug(5);
    	boolean b = hw.bug(1);
//    	int d = hw.Method4(1, 2, 2, 2, 0);
    }
}
