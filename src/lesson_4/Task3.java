package lesson_4;

import java.util.Scanner;

public class Task3 implements TaskName {

    public void getTensAndOnes(int x) {
            if (x > 9 && x < 100) {
                int d = x / 10;
                int ed = x % 10;
                System.out.println(d + " " + ed);
            } else {
                System.out.println("The number you entered is not a positive 2 digit number");
            }
    }
    public String getTaskName() {
        return "Task 3 - Get tens and ones";
    }
}
