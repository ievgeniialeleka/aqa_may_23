package com.hillel.lesson_10.inheritance;

public class Truck extends Vehicle {

    private int maxload;

    private int trunkvolume;

    public Truck() {
        super();
    }

    public Truck(int speed, double weight, String color, double price, int maxload, int trunkvolume) {
        super(speed, weight, color, price);
        this.maxload = maxload;
        this.trunkvolume = trunkvolume;
    }

    public int getMaxload() {
        return maxload;
    }

    public void setMaxload(int maxload) {
        this.maxload = maxload;
    }

    public int getTrunkvolume() {
        return trunkvolume;
    }

    public void setTrunkvolume(int trunkvolume) {
        this.trunkvolume = trunkvolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nMaxload: " + maxload + ", Trunk volume: " + trunkvolume;
    }


}
