package lesson_4;

import java.util.Scanner;

public class Task6 implements TaskName {
//    public static void main(String[] args) {
//        //Task6
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Enter a number for task 6: ");
//        if(sc3.hasNextInt()) {
//            int x = sc3.nextInt();
//            if (x > 0) {
//                System.out.println("The number is positive");
//            } else if (x < 0) {
//                System.out.println("The number is negative");
//            } else {
//                System.out.println("The number is 0");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }
//        System.out.println();
//    }

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
