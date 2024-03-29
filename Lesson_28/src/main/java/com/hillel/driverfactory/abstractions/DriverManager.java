package com.hillel.driverfactory.abstractions;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
}
