package lesson_4;

import java.util.Scanner;

public class Task7 implements TaskName {
    public void subtractOne(int x) {
        // так как x >= 100 проверяет оба условия: как минимум трехзначное и положительное, я не добавляла других
            if (x >= 100) {
                --x;
                // в данном случае так тоже можно
                // x--;
                System.out.println(x);
            } else {
                System.out.println("The number you entered is not a positive 3 digit number");
            }
    }
    public String getTaskName() {
        return "Task 7 - Subtract one";
    }
}
