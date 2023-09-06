package com.hillel.pink.abstractions;

import com.hillel.pink.flows.commonflows.HeaderFlow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractFlow {

    private HeaderFlow headerFlow;

    public AbstractFlow(WebDriver driver) {
        this.headerFlow = new HeaderFlow(driver);
    }

    public HeaderFlow getHeaderFlow() {
        return headerFlow;
    }

    public static boolean isElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }
    public static boolean doesCurrentUrlContain(WebDriver driver, String text) {
        return driver.getCurrentUrl().contains(text);
    }
}
