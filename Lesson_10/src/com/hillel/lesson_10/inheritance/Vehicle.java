package com.hillel.lesson_10.inheritance;

public abstract class Vehicle {
    private int speed;

    private double weight;

    private String color;

    private double price;

    public Vehicle() {
    }

    public Vehicle(int speed, double weight, String color, double price) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public Vehicle(int speed, double weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Vehicle(int speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public double getMilesPerGallon(int gallon, int miles) {
        return miles / gallon;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String gas();

    public abstract String brake();

    public abstract String stop();

    public String roadBehavior(TrafficLight trafficlight) {
        String result = null;
        switch(trafficlight) {
            case RED:
                result =  stop();
                break;
            case YELLOW:
                result = brake();
                break;
            case GREEN:
                result = gas();
                break;
        } return result;
    }

    @Override
    public String toString() {
        return "Speed: " + speed + ", Weight: " + weight + ", Color: " + color + ", Price: " + price;
    }
}
