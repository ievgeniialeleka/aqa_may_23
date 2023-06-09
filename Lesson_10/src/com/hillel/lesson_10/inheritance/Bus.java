package com.hillel.lesson_10.inheritance;

public class Bus extends Vehicle {

    private int passengers;

    public Bus() {
        super();
    }

    @Override
    public String gas() {
        return "Bus is picking up the speed";
    }

    @Override
    public String brake() {
       return "Bus is slowing down";
    }

    @Override
    public String stop() {
        return "Bus has come to a complete stop";
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

    @Override
    public boolean equals(Object ob) {
        if (this == ob)
            return true;

        if (ob == null || !(ob instanceof Bus))
            return false;

        Bus otherBus = (Bus) ob;
        if (this.getSpeed() != otherBus.getSpeed()) return false;
        if (this.getWeight() != otherBus.getWeight()) return false;
        if (this.passengers != otherBus.passengers) return false;
        if (!this.getColor().equals(otherBus.getColor())) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        final int prime = 17;
        result = prime * (result + getSpeed());
        result = prime * (result + (int) getWeight());
        result = prime * (result + getPassengers());
        result = prime * (result + (getColor() == null ? 0 : getColor().hashCode()));
        return result;
    }
}
