/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohamed
 */
public class MathIT {
    
    public MathIT() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     /**
     * Test of add method, of class Math.
     */
   @Test
public void testAdd() {
System.out.println("testAdd");
int a = 3;
int b = 4;
Math instance = new Math();
int expResult = 7;
int result = instance.add(a, b);
assertEquals(expResult, result);
}

    /**
     * Test of subtract method, of class Math.
     */
    @Test
public void testSubtract() {
System.out.println("testSubtract");
int a = 5;
int b = 3;
Math instance = new Math();
int expResult = 2;
int result = instance.subtract(a, b);
assertEquals(expResult, result);
}
 /**
     * Test of divide method, of class Math.
     */
    @Test
public void testdivid() {
System.out.println("testmulti");
int a = 5;
int b = 3;
Math instance = new Math();
int expResult = 1;
int result = instance.divid(a, b);
assertEquals(expResult, result);
}
/**
     * Test of multi method, of class Math.
     */
    @Test
public void testmulti() {
System.out.println("testmulti");
int a = 5;
int b = 3;
Math instance = new Math();
int expResult = 15;
int result = instance.multi(a, b);
assertEquals(expResult, result);
}
/**
     * Test of forloob method, of class Math.
     */
    @Test
public void testforloob() {
System.out.println("testmulti");
int a = 5;
int b = 3;
Math instance = new Math();
int expResult = 180;
int result = instance.forloob(a, b);
assertEquals(expResult, result);
}
/**
     * Test of alpha method, of class Math.
     */
    @Test
public void testreadname() {
System.out.println("readname");
char a='a';

Math instance = new Math();
        char expResult = 'j';
        
char result = instance.readname((char) a);
assertEquals( expResult, result);
}
@Test
    public void MathIT() {
        Math instance = new Math();
        int t=instance.add(3,4)+ instance.subtract(10,3)+ instance.multi(3, 3)+instance.divid(5, 3);
        System.out.println (t);
        assertEquals(14, t);
    }
}
