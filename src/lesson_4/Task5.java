package lesson_4;

import java.util.Scanner;

public class Task5 implements TaskName {
    public void getWeightOfNumber(int x) {
        if (x > 9 && x < 100) {
                int d = x / 10;
                int ed = x % 10;
                int weight = d + ed;
                System.out.println(weight);
            } else {
                System.out.println("The number you entered is not a positive 2 digit number");
            }
    }
    public String getTaskName() {
        return "Task 5 - Weight of number";
    }
}
