package com.hillel.lesson5_loops;

public class Task {
    int start;
    int end;

    Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void displayFourDigitNumbers() {
        for (int i = start; i <= end; i += 3) {
            if (i > 999 && i < 10000)
                System.out.println(i);
        }
    }

    public void displayPositiveNumbers() {
        for (int i = start; i >= end; i -= 4) {
            if (i < 0)
                continue;
            System.out.println(i);
        }
    }
}
