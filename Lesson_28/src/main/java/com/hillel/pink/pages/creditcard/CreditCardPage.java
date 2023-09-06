package com.hillel.pink.pages.creditcard;

import com.hillel.pink.abstractions.AbstractPage;
import com.hillel.pink.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditCardPage extends AbstractPage {

    private static final By CREDIT_CARD_TITLE = By.xpath("//div[@class='fabric-itc-content-region']//div[@class='fabric-itc-content-region-text-field-4']");

    public CreditCardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCREDIT_CARD_TITLE() { return WaiterManager.waitUntilElementIsVisible(driver, CREDIT_CARD_TITLE); }
}
