package lesson_4;

import java.util.Scanner;

public class Task4 implements TaskName {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number for task 4: ");
//        if(sc.hasNextInt()) {
//            int x = sc.nextInt();
//            if (x > 9 && x < 100) {
//                int d = x / 10 * 10;
//                int ed = x % 10;
//                System.out.println(d + " " + ed);
//            } else {
//                System.out.println("The number you entered is not a positive 2 digit number");
//            }
//        } else {
//            System.out.println("You entered invalid number");
//        }

    public void getFullTensAndOnes(int x) {
        if (x > 9 && x < 100) {
                int d = x / 10 * 10;
                int ed = x % 10;
                System.out.println(d + " " + ed);
            } else {
                System.out.println("The number you entered is not a positive 2 digit number");
            }
    }
    public String getTaskName() {
        return "Task 4 - Full tens and ones";
    }
}
