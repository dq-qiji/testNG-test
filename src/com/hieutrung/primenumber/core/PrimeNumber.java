/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutrung.primenumber.core;

/**
 *
 * @author PC
 */
public class PrimeNumber {
    
    //Hàm này dùng để kiểm tra xem một số nguyên n có nguyên tố hay không.
    //Input: Số nguyên n.
    //Output: true/false biểu thị cho việc số đó là/không phải là số nguyên tố.
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        
        return true;
    }
    
    //Hàm này dùng để tìm số lượng số nguyên tố nhỏ hơn hoặc bằng n. 
    //Input: Số nguyên n.
    //Output: Số lượng số nguyên tố nhỏ hơn hoặc bằng n.
    public static int countPrime(int n) {
        //như lẽ thường thì ra 0 => Nhưng mình bắt Exception.
        if (n <= 1)
            throw new IllegalArgumentException("Số lớn hơn 1 tui mới chịu!!!");
        
        int count = 0;
        
        for (int i = 2; i <= n; i++)
            if(isPrime(i))
                count++;
        
        return count;
    }
}
