package com.hillel.lesson_10.inheritance;

public class Bus extends Vehicle {

    private int passengers;

    public Bus() {
        super();
    }

    public Bus(int speed, double weight, String color, int passengers) {
        super(speed, weight, color);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passengers: " + passengers;
    }
}
