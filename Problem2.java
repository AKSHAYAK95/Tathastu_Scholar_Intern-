// Write a Java program to calculate Fibonacci Series up to n numbers.

package com.company;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args)
    {
        int  c = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate fibonacci series upto nth term");
        n=sc.nextInt();
        int a=0;
        int b=1;

        System.out.println("Fibonacci series up-to "+n+" is :-");
        while(c<=n)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}