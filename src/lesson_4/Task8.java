package lesson_4;

import java.util.Scanner;

public class Task8 implements TaskName {
//    public static void main(String[] args) {
//        //Task8
//        Scanner sc5 = new Scanner(System.in);
//        System.out.println("Enter a number for task 8: ");
//        if(sc5.hasNextInt()) {
//            int x = sc5.nextInt();
//            if (x > 9 && x < 100) {
//                int d = x / 10;
//                int ed = x % 10;
//                int product = d * ed;
//                if (product > x) {
//                    System.out.println(product + " is bigger than " + x);
//                } else if (product < x) {
//                    System.out.println(x + " is bigger than " + product);
//                } else if (product == x) {
//                    System.out.println(product + " and " + x + " are equal");
//                }
//            } else {
//                System.out.println("The number you entered is not a positive 2 digit number");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }
//        System.out.println();
//    }

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
