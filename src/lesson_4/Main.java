package lesson_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.convertCmToInches(10);
        task1.convertInchesToCm(25);
        System.out.println();

        Task2 task2 = new Task2();
        task2.calculateVacationBudget(5000, 5000);
        System.out.println();

        Task3 task3 = new Task3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for " + task3.getTaskName());
        if (sc.hasNextInt()) {
            task3.getTensAndOnes(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        Task4 task4 = new Task4();
        System.out.println("Enter a number for " + task4.getTaskName());
        if (sc.hasNextInt()) {
            task4.getFullTensAndOnes(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        Task5 task5 = new Task5();
        System.out.println("Enter a number for task " + task5.getTaskName());
        if (sc.hasNextInt()) {
            task5.getWeightOfNumber(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        Task6 task6 = new Task6();
        System.out.println("Enter a number for task " + task6.getTaskName());
        if (sc.hasNextInt()) {
            task6.checkNumber(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        Task7 task7 = new Task7();
        System.out.println("Enter a number for task " + task7.getTaskName());
        if (sc.hasNextInt()) {
            task7.subtractOne(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();

        Task8 task8 = new Task8();
        System.out.println("Enter a number for task " + task8.getTaskName());
        if (sc.hasNextInt()) {
            task8.getBiggerNumber(sc.nextInt());
        } else {
            System.out.println("You entered invalid number");
            sc.nextLine();
        }
        System.out.println();
        sc.close();
    }
}
