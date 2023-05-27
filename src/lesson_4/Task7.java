package lesson_4;

import java.util.Scanner;

public class Task7 implements TaskName {
//    public static void main(String[] args) {
//        //Task7
//        Scanner sc4 = new Scanner(System.in);
//        System.out.println("Enter a number for task 7: ");
//        if(sc4.hasNextInt()) {
//            int x = sc4.nextInt();
//            // так как x >= 100 проверяет оба условия: как минимум трехзначное и положительное, я не добавляла других
//            if (x >= 100) {
//                --x;
//                // в данном случае так тоже можно
//                // x--;
//                System.out.println(x);
//            } else {
//                System.out.println("The number you entered is not a positive 3 digit number");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }
//        System.out.println();
//    }

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
