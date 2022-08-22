// Write a Java program to remove elements from an ArrayList.

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "Xavier", "Akshay", "charles") );

        System.out.println(namesList);

        // By index
        namesList.remove(1);

        // By Value
        // namesList.remove("alex");

        System.out.println(namesList);
    }
}