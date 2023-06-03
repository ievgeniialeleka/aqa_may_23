package com.hillel.lesson5_loops;

public class Task4 {
    public int getSumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
