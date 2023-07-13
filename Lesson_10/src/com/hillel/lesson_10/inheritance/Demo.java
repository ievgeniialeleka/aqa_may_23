package com.hillel.lesson_10.inheritance;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Vehicle c1 = new Car(200, 2500, "yellow", 50000, "Ford", "Mustang", 313, "coupe");
        Vehicle t1 = new Truck(150, 4500, "black", 80000, 800, 300);
        Vehicle b1 = new Bus(100, 5000, "red", 30);
        Vehicle b2 = new Bus(100, 5000, "red", 30);

        b1.setPrice(100000);
        b2.setPrice(100000);

        System.out.println(c1);
        System.out.println();
        System.out.println(t1);
        System.out.println();
        System.out.println(b1);
        System.out.println();
        System.out.println(c1.brake());
        System.out.println(t1.gas());
        System.out.println(b1.brake());
        System.out.println();
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println();

        TrafficLight[] colors = TrafficLight.values();
        for (TrafficLight temp : colors) {
            System.out.println("When the light is " + temp + " " + c1.roadBehavior(temp));
            System.out.println("When the light is " + temp + " " + t1.roadBehavior(temp));
            System.out.println("When the light is " + temp + " " + b1.roadBehavior(temp));
        }
        System.out.println();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a traffic light color:");
            String color = sc.nextLine().toUpperCase();
            System.out.println(TrafficLight.valueOf(color) + " - duration is " + TrafficLight.valueOf(color).getDuration() +" seconds.");
        } catch (IllegalArgumentException exc) {
            System.out.println("You entered invalid color!");
        }
    }
}
