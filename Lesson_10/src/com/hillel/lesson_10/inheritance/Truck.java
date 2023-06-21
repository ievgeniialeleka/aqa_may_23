package com.hillel.lesson_10.inheritance;

public class Truck extends Vehicle {

    int maxload;

    int trunkvolume;

    public Truck() {
        super();
    }

    public Truck(int speed, double weight, String color, double price, int maxload, int trunkvolume) {
        super(speed, weight, color, price);
        this.maxload = maxload;
        this.trunkvolume = trunkvolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nMaxload: " + maxload + ", Trunk volume: " + trunkvolume;
    }


}
