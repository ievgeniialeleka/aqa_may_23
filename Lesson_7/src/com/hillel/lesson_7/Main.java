package com.hillel.lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Calculator.getInt(sc);
        int num2 = Calculator.getInt(sc);
        char operator = Calculator.getOperation(sc);
        int result = Calculator.calc(num1, num2, operator);
        System.out.println(result);

        //System.out.println(Calculator.calc(Calculator.getInt(sc), Calculator.getInt(sc), Calculator.getOperation(sc)));

        sc.close();
    }
}
