/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author priya
 */
public class Factorial {
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial: " + obj.factorial(3));
    }
}
