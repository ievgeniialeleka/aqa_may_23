package com.hillel.lesson_10.inheritance;

public class Car extends Vehicle {

    String make;

    String model;

    int horsepower;

    String bodytype;

    public Car() {
        super();
    }

    public Car(int speed, double weight, String color, double price, String make, String model, int horsepower, String bodytype) {
        super(speed, weight, color, price);
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
        this.bodytype = bodytype;
    }

    public Car(int speed, double weight, String color, double price, String make, String model) {
        super(speed, weight, color, price);
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nMake: " + make + ", Model: " + model + ", Horsepower: " + horsepower + ", Body type: " + bodytype;
    }


}
