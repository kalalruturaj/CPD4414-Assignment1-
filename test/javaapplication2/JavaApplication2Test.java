/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0655987
 */
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
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
     * Test of numberOfAs method, of class JavaApplication2.
     */
    @Test
    public void testNumberOfAs() {
        System.out.println("numberOfAs");
        String input = "";
        int expResult = 0;
        int result = JavaApplication2.numberOfAs(input);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testAAAAShouldReturn4(){
        String input = "AAAA";
        int expResult = 4;
        
        int result = JavaApplication2.numberOfAs(input);
        assertEquals("AAAA should return 4", expResult,result);
    }
}
