/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit5.basics;

/**
 *
 * @author Jonas
 * @param <T>
 * @param <Float>
 * @param <Double>
 */
public class Taschenrechner<T extends Integer , Float , Double> {
    
    public int add(T a, T b)
    {
        return a + b;
    }
    
    public int sub(T a, T b)
    {
        return a - b ;
    }
        
    public int div(T a, T b)
    {
        return a / b ;
    }
    public int mul(T a, T b)
    {
        return a * b ;
    }
            
    
}
