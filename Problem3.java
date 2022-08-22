// Write a Java program to calculate a Factorial of a number.

package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args)
    {

        Scanner sc10=new Scanner(System.in);


        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);
    }
}