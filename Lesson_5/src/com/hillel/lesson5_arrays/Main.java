package com.hillel.lesson5_arrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Task1
        int[] arr1 = new int[10];

        int counter = 2;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = counter;
            counter += 2;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

        //Task2
        int[] arr2 = new int[50];

        int count = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = count;
            count += 2;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = (arr2.length - 1); i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Task3
        int[] randomArr1 = new int[5];
        int[] randomArr2 = new int[5];

        Random random = new Random();
        for (int i = 0; i < randomArr1.length; i++) {
            randomArr1[i] = random.nextInt(6);
        }

        for (int i = 0; i < randomArr2.length; i++) {
            randomArr2[i] = random.nextInt(6);
        }

        for (int temp : randomArr1) {
            System.out.print(temp + " ");
        }

        System.out.println();
        for (int temp : randomArr2) {
            System.out.print(temp + " ");
        }
        System.out.println();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < randomArr1.length; i++) {
            sum1 += randomArr1[i];
        }

        for (int i = 0; i < randomArr2.length; i++) {
            sum2 += randomArr2[i];
        }

        double avg1 = (double) sum1 / randomArr1.length;
        double avg2 = (double) sum2 / randomArr2.length;

        if (avg1 > avg2) {
            System.out.println("Average of the first array is bigger");
        } else if (avg1 < avg2) {
            System.out.println("Average of the second array is bigger");
        } else {
            System.out.println("Average of arrays is equal");
        }
    }
}
