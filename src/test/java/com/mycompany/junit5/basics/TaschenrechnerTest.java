/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit5.basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class TaschenrechnerTest {
    
    public TaschenrechnerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Taschenrechner.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Integer a = 1;
        Integer b = 0;
        Taschenrechner instance = new Taschenrechner();
        int expResult = 1;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Taschenrechner.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Integer a = 1;
        Integer b = 0;
        Taschenrechner instance = new Taschenrechner();
        int expResult = 1;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Taschenrechner.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        Integer a = 1;
        Integer b = 1;
        Taschenrechner instance = new Taschenrechner();
        int expResult = 1;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Taschenrechner.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        Integer a = 1;
        Integer b = 1;
        Taschenrechner instance = new Taschenrechner();
        int expResult = 1;
        int result = instance.mul(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
