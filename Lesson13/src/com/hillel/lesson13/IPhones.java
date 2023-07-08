package com.hillel.lesson13;

public class IPhones implements Smartphones {

    private String model;

    public IPhones(String model) {
        this.model = model;
    }
    @Override
    public void call() {
        System.out.println("iPhone " + this.model + " is making a call");
    }

    @Override
    public void sms() {
        System.out.println("iPhone " + this.model + " is sending sms");

    }
    @Override
    public void internet() {
        System.out.println("iPhone " + this.model + " is connecting to the internet");
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "this is an iPhone model " + this.model;
    }
}
