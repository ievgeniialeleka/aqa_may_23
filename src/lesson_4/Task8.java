package lesson_4;

import java.util.Scanner;

public class Task8 implements TaskName {
    public void getBiggerNumber(int x) {
        if (x > 9 && x < 100) {
                int d = x / 10;
                int ed = x % 10;
                int product = d * ed;
                if (product > x) {
                    System.out.println(product + " is bigger than " + x);
                } else if (product < x) {
                    System.out.println(x + " is bigger than " + product);
                }
            } else {
                System.out.println("The number you entered is not a positive 2 digit number");
            }
    }
    public String getTaskName() {
        return "Task 8 - Get bigger number";
    }
}
