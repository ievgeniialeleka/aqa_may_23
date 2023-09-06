package com.hillel.pink.pages.commonelements;

import com.hillel.pink.abstractions.AbstractPage;
import com.hillel.pink.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderMenu extends AbstractPage {

    private static final By ACCOUNT_ICON = By.xpath("//div[@class='sc-196dw0h-0 glOrOM prism-icon prism-icon-account']");
    private static final By SHOPPING_BAG_ICON = By.xpath("//div[@class='react-masthead-utility-nav']//a[@id='masthead-utility-nav-tab-shopping-bag']");
    private static final By CLOSE_SHOPPING_BAG_BUTTON = By.xpath("//button[@class='sc-1916wqc-0 ikgKVu prism-typography sc-kvqjvi-0 cKAkHQ prism-button prism-button-plain']");
    private static final By CREDIT_CARD_ICON = By.xpath("//div[@class='react-masthead-utility-nav']//a[@class='sc-iolboe-0 chwAtP prism-link sc-19jncqv-3 cTkAmh']");
    private static final By REGISTRATION_LINK = By.xpath("//a[@class='sc-iolboe-0 chwAtP prism-link create-account-link']");
    private static final By PINK_HOME_ICON = By.xpath("//div[@class='sc-h43cyu-1 iftkgn']//a[@title='PINK Home']");

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getACCOUNT_ICON() {
        return WaiterManager.waitUntilElementIsVisible(driver, ACCOUNT_ICON);
    }
    public WebElement getREGISTRATION_LINK() { return driver.findElement(REGISTRATION_LINK); }
    public WebElement getSHOPPING_BAG_ICON() { return WaiterManager.waitUntilElementIsVisible(driver, SHOPPING_BAG_ICON); }
    public WebElement getCLOSE_SHOPPING_BAG_BUTTON() { return driver.findElement(CLOSE_SHOPPING_BAG_BUTTON); }
    public WebElement getCREDIT_CARD_ITEM() { return WaiterManager.waitUntilElementIsVisible(driver, CREDIT_CARD_ICON); }
    public WebElement getPINK_HOME_ICON() { return driver.findElement(PINK_HOME_ICON); }
}
