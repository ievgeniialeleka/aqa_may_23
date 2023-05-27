package lesson_4;

import java.util.Scanner;

public class Task3 implements TaskName {
//    public static void main(String[] args) {
//        //Task 3
//        int d = 0;
//        int ed = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number for task 3: ");
//        if(sc.hasNextInt()) {
//            int x = sc.nextInt();
//            if (x > 9 && x < 100) {
//                d = x / 10;
//                ed = x % 10;
//                System.out.println(d + " " + ed);
//            } else {
//                System.out.println("The number you entered is not a positive 2 digit number");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }
//    }
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
