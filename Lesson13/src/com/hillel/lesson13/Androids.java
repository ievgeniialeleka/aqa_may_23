package com.hillel.lesson13;

public class Androids implements Smartphones {

    private String model;

    public Androids(String model) {
        this.model = model;
    }
    @Override
    public void call() {
        System.out.println("Android phone " + this.model + " is making a call");
    }

    @Override
    public void sms() {
        System.out.println("Android phone " + this.model + " is sending sms");

    }

    @Override
    public void internet() {
        System.out.println("Android phone " + this.model + " is connecting to the internet");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "This is Android phone of " + this.model + " model";
    }
}
