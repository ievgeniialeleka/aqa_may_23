package com.hillel.pink.abstractions;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(WebDriver driver) {
        return driver;
    }
}
