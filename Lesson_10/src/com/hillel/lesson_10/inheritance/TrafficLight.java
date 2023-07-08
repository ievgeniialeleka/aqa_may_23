package com.hillel.lesson_10.inheritance;

public enum TrafficLight {
    RED(15),
    YELLOW(5),
    GREEN(60);

    private int duration;
    TrafficLight(int duration) {
        this.duration = duration;
    }
    TrafficLight() {}

    int getDuration() {
        return this.duration;
    }
}
