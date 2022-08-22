// Write a Java Program to reverse the letters present in the given String.

package com.company;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        String initial, rev="";
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the string to reverse");
        initial=in.nextLine();
        int length=initial.length();

        for(int i=length-1;i>=0;i--)
            rev=rev+initial.charAt(i);
        System.out.println("Reversed string: "+rev);
    }
}