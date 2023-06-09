package com.hillel.lesson5_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task1
        Task task1 = new Task(1000, 1015);
        task1.displayFourDigitNumbers();

        System.out.println();
        //Task2
        Task task2 = new Task(10, -10);
        task2.displayPositiveNumbers();
        System.out.println();

        //Task3
        Task3 task3 = new Task3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial: ");
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Factorial of " + number + " equals " + task3.getFactorialForLoop(number) + " (using for loop)");
            System.out.println("Factorial of " + number + " equals " + task3.getFactorialDoWhile(number) + " (using do while)");
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        //Task4
        Task4 task4 = new Task4();
        System.out.println("Enter a number to calculate the sum of digits: ");
        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Sum of digits of the number " + number + " equals " + task4.getSumOfDigits(number));
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        sc.close();
    }
}
