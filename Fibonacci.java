/*
 * Fibonacci.java
 * recursion example with Fibonacci numbers
 * @author Gabor Jaszfalvi
 * 2016
 */

package DataStrAlg;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {        
        if (n == 1 || n == 2) {                         // base case
            return 1;
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));   // recursive case
        }
    }
    
    public static void series(int n) {
        // prints n elements of the fibonacci series
        for (int i = 1; i < n; i++) {
            System.out.println("Element " + i + " is " + fibonacci(i));
        }
    }
    
    public static void fibforloop(int n) {     // without recursion using a for loop
        int a = 0;
        int b = 1;
        System.out.println("Element "+ 1 + " is " + b);
        for (int i=2; i<n; i++) {    
            int c = a+b;
            System.out.println("Element "+ i + " is " + c);
            a = b;
            b = c;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The Fibonacci numbers to N, give the number for N:");
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        series(n+1);
        fibforloop(n+1);
    }   
}
