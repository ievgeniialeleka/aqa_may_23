package com.hillel.lesson5_loops;

public class Task3 {

    public int getFactorialForLoop(int x) {
        int result = 1;
        for (int i = 1; i <= x ; i++) {
            result *= i;
        }
        return result;
    }

    public int getFactorialDoWhile(int x) {
        int counter = 1;
        do {
            counter *= x;
            x--;
        } while (x > 0);
        return counter;
    }



}
