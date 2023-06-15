package com.hillel.lesson_8;

public class Animals {

    String species;

    int weight;

    boolean tail;

    boolean wings;

    Habitat habitat;

    public Animals(String species, int weight, boolean wings, boolean tail, Habitat habitat) {
        this.species = species;
        this.weight = weight;
        this.wings = wings;
        this.tail = tail;
        this.habitat = habitat;
    }

    public Animals(String species, int weight, boolean wings) {
        this.species = species;
        this.weight = weight;
        this.wings = wings;
    }

    public Animals(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animals(String species) {
        this.species = species;
    }

    public boolean hasWings() {
        return wings;
    }

    public boolean hasTail() {
        return tail;
    }

    public void updateSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Weight: " + weight + ", Tail: " + tail + ", Wings: " + wings + "; \nHabitat: " + habitat.getHabitatInfo();
    }

}
