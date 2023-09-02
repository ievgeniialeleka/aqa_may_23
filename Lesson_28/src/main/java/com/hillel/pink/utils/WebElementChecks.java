package com.hillel.pink.utils;

import org.openqa.selenium.WebElement;

public class WebElementChecks {
    public static boolean isElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }
}
