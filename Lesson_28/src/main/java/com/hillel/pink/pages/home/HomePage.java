package com.hillel.pink.pages.home;

import com.hillel.pink.abstractions.AbstractPage;
import com.hillel.pink.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
    private static final By PINK_HOME_PAGE_SEARCH_BOX = By.xpath("//input[@id='prism-input-search-1']");
    private static final By SLEEP_MENU_ITEM = By.xpath("//div[@class='sc-1lzvqrf-2 fWSvAv']//a[text()='SLEEP']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPINK_HOME_PAGE_SEARCH_BOX() { return WaiterManager.waitUntilElementIsVisible(driver, PINK_HOME_PAGE_SEARCH_BOX);}
    public WebElement getSLEEP_MENU_ITEM() { return driver.findElement(SLEEP_MENU_ITEM);}
}
