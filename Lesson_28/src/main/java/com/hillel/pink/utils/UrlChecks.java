package com.hillel.pink.utils;

import org.openqa.selenium.WebDriver;

public class UrlChecks {

    public static boolean doesCurrentUrlContain(WebDriver driver, String text) {
        return driver.getCurrentUrl().contains(text);
    }
}
