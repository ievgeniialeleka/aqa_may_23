package com.hillel.lesson_8;

public class Main {
    public static void main(String[] args) {
        Habitat habitat = new Habitat("USA", "tropics");
        Animals animal = new Animals("shark", 100, false, true, habitat);

        System.out.println(animal.toString());
    }
}
