/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.primenumber.test;

import static com.hieutrung.primenumber.core.PrimeNumber.*;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author PC
 */
public class PrimeNumberNGTest {

    public PrimeNumberNGTest() {
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println("STARTING TEST 1");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("DONE TEST 1!!!");
    }
    
    @BeforeMethod
    public void beforeTest1() {
        System.out.println("    Start 1 test");
    }
    
    @AfterMethod
    public void afterTest1() {
        System.out.println("    Done 1 test!!!");
        System.out.println(" ");
    }
    
    
    //Test case #1: check countPrime() with valid argument
    //n = 10, expected = 4
    @Test
    public void testCountPrimeWithValidArgument() {
        System.out.println("        Test 1");
        assertEquals(countPrime(10), 4);
    }
    
    //Test case #2: check countPrime() with invalid argument
    //n = -10, expected : Exception
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCountPrimeWithInvalidArgument() {
        System.out.println("        Test 2");
        assertEquals(countPrime(-10), 4);
    }
}
