// Write a Java program to calculate Permutation and Combination of 2 numbers.

package com.company;

import java.util.Scanner;

public class Problem5 {
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        r = scanner.nextInt();

        System.out.print("Combination is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nPermutation is " +(fact(n)/(fact(n-r))));
    }
}