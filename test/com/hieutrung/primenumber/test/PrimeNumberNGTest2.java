/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.primenumber.test;

import static com.hieutrung.primenumber.core.PrimeNumber.countPrime;
import static com.hieutrung.primenumber.core.PrimeNumber.isPrime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class PrimeNumberNGTest2 {
    
    public PrimeNumberNGTest2() {
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println("STARTING TEST 2");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("DONE TEST 2!!!");
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
    
    //Test case #3: check isPrime() with valid argument
    //n = 3, expected = true
    @Test
    public void testIsPrimeWithValidArgument() {
        System.out.println("        Test 3");
        assertEquals(isPrime(3), true);
    }
    
    
    //Test case #4: check countPrime() with valid argument and depend on isPrime
    //If isPrime Passed All : Start to test this case.
    //If Red Line : Skip this case.
    @Test(dependsOnMethods = {"testIsPrimewithvalidargument"})
    public void testCountPrimeWithValidArgumentAndDependsOnMethods() {
        System.out.println("        Test 4");
        assertEquals(countPrime(10), 4);
    }
    
    
    @DataProvider (name = "Quan")
    public Object[][] initData(){
	return new Integer[][] {
            {10,4},
            {20,8},
            {3,2},
            {37,12},
            {5,3}
        };
    }
    
    //Test case #5: check countPrime() with invalid argument & use Data Provider
    @Test(dataProvider = "Quan")
    public void testCountPrimeWithDataProvider(int n, int result) {
        System.out.println("        Input: " + n + ", Expected: " + result);
        assertEquals(countPrime(n), result);
    }
}
