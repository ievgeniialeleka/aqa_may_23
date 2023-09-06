package com.hillel.pink.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaiterManager {

    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    public static WebElement waitUntilElementIsVisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
