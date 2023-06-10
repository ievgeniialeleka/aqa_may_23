package com.hillel.lesson_7;

import java.util.Scanner;

public class Calculator {

    public static int getInt(Scanner sc) {
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    public static char getOperation(Scanner sc) {
        System.out.println("Enter an operation: ");
        return sc.next().trim().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch(operation) {
            case '+' :
                result = num1 + num2;
                break;

            case '-' :
                result = num1 - num2;
                break;

            case '*' :
                result = num1 * num2;
                break;

            case '/' :
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    System.exit(0);
                    break;
                } else {
                    result = num1 / num2;
                }
                break;
            default :
                System.out.println("You've entered invalid operator");
                System.exit(0);

        }
        return result;
    }
}
