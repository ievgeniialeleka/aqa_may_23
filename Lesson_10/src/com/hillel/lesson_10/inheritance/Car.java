package com.hillel.lesson_10.inheritance;

public class Car extends Vehicle {

    private String make;

    private String model;

    private int horsepower;

    private String bodytype;

    public Car() {
        super();
    }

    @Override
    public void gas() {
        System.out.println("Car is picking up the speed");
    }

    @Override
    public void brake() {
        System.out.println("Car is slowing down");
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nMake: " + make + ", Model: " + model + ", Horsepower: " + horsepower + ", Body type: " + bodytype;
    }


}
