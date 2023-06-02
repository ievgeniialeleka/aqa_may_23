package lesson_4;

import java.util.Scanner;

public class Task6 implements TaskName {
    public void checkNumber(int x) {
        if (x > 0) {
                System.out.println("The number is positive");
            } else if (x < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is 0");
            }
    }
    public String getTaskName() {
        return "Task 6 - Check number";
    }
}
