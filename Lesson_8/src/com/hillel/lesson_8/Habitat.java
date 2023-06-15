package com.hillel.lesson_8;

public class Habitat {

    String country;

    String geographicalzone;

    public Habitat(String country, String geographicalzone) {
        this.country = country;
        this.geographicalzone = geographicalzone;
    }

    public String getHabitatInfo() {
        return "Country: " + country + ", Geographical Zone: " + geographicalzone;
    }
}
