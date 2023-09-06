package com.hillel.pink.pages.shoppingbag;

import com.hillel.pink.abstractions.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingBagPage extends AbstractPage {

    private static final By SHOPPING_BAG_TITLE = By.xpath("//h1[@id='bag-drawer-heading']//span");

    public ShoppingBagPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSHOPPING_BAG_TITLE() { return driver.findElement(SHOPPING_BAG_TITLE); }
}
