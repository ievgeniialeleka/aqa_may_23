package com.hillel.pink.pages.login;

import com.hillel.pink.abstractions.AbstractPage;
import com.hillel.pink.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    public static final By LOGIN_FIELD = By.xpath("//input[@id='prism-input-email-1']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='prism-input-password-1']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@data-testid='submit-signin-form']");
    public static final By LOGIN_ERROR_MESSAGE = By.xpath("//span[@class='sc-1916wqc-0 idvvlT prism-typography']");
    public static final By INCOMPLETE_LOGIN_ERROR_MESSAGE = By.xpath("//span[@class='sc-1916wqc-0 idvvlT prism-typography']");
    public static final By REGISTRATION_BUTTON = By.xpath("//button[@id='create-an-account']");

    public LoginPage(WebDriver driver) {
         super(driver);
    }

    public WebElement getLOGIN_FIELD() { return WaiterManager.waitUntilElementIsVisible(driver, LOGIN_FIELD); }
    public WebElement getPASSWORD_FIELD() {
        return WaiterManager.waitUntilElementIsVisible(driver, PASSWORD_FIELD);
    }
    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }
    public WebElement getLOGIN_ERROR_MESSAGE() { return WaiterManager.waitUntilElementIsVisible(driver, LOGIN_ERROR_MESSAGE); }
    public WebElement getREGISTRATION_BUTTON() { return WaiterManager.waitUntilElementIsVisible(driver, REGISTRATION_BUTTON); }
    public WebElement getINCOMPLETE_LOGIN_ERROR_MESSAGE() { return driver.findElement(INCOMPLETE_LOGIN_ERROR_MESSAGE); }
}
