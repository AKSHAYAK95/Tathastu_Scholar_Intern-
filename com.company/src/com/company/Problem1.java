// Write a Java program to perform basic Calculator operations.

package com.company;

import java.util.Scanner;

public class Problem1 {

        public static void main(String[] args) {

            char operator;
            Double number1, number2, result;


            Scanner input = new Scanner(System.in);

            // user enters operator
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            // user enters numbers
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            switch (operator) {

                //  addition
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                //  subtraction
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                //  multiplication
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                //  division
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            input.close();
        }

}