package com.hillel.lesson_10.inheritance;

public class Demo {
    public static void main(String[] args) {
        Vehicle c1 = new Car(200, 2500, "yellow", 50000, "Ford", "Mustang", 313, "coupe");
        Vehicle t1 = new Truck(150, 4500, "black", 80000, 800, 300);
        Vehicle b1 = new Bus(100, 5000, "red", 30);
        Vehicle b2 = new Bus(100, 5000, "red", 30);

        b1.setPrice(100000);
        b2.setPrice(100000);

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(t1.toString());
        System.out.println();
        System.out.println(b1.toString());
        System.out.println();
        c1.brake();
        t1.gas();
        b1.brake();
        System.out.println();
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

    }
}
