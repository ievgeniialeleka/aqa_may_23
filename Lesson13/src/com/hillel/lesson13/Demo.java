package com.hillel.lesson13;

public class Demo {

    public static void main(String[] args) {

        Smartphones p1 = new IPhones("13 Pro Max");
        Smartphones p2 = new Androids("Samsung Galaxy S22");

        p1.call();
        p2.call();
        p1.sms();
        p2.sms();
        p1.internet();
        p2.internet();
    }
}
