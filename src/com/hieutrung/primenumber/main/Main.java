/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.primenumber.main;

import com.hieutrung.primenumber.core.PrimeNumber;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        int tmp1 = 5;
        
        if (PrimeNumber.isPrime(tmp1))
            System.out.println("Is prime");
        else
            System.out.println("Is not prime");

        
       int tmp2 = 10;
       
       int result = PrimeNumber.countPrime(tmp2);
       System.out.println(result);
    }
}
