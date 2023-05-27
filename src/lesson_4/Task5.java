package lesson_4;

import java.util.Scanner;

public class Task5 implements TaskName {
//    public static void main(String[] args) {
//        //Task 5
//        int weight = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number for task 5: ");
//        if(sc.hasNextInt()) {
//            int x = sc.nextInt();
//            if (x > 9 && x < 100) {
//                int d = x / 10;
//                int ed = x % 10;
//                weight = d + ed;
//                System.out.println(weight);
//            } else {
//                System.out.println("The number you entered is not a positive 2 digit number");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }
//        System.out.println();
//    }

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
