package com.hillel.pink.pages.registration;

import com.hillel.pink.abstractions.AbstractPage;
import com.hillel.pink.utils.WaiterManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage {

    private static final By REGISTRATION_PAGE_TITLE = By.xpath("//h1[@class='sc-1916wqc-0 bluNmm prism-typography sc-cd13dv-2 eyaFrk']");
    private static final By FIRST_NAME_FIELD = By.xpath("//input[@name='firstName']");
    private static final By LAST_NAME_FIELD = By.xpath("//input[@name='lastName']");
    private static final By EMAIL_FIELD = By.xpath("//input[@name='email']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
    private static final By PHONE_FIELD = By.xpath("//input[@name='phoneNumberField']");
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[@type='submit']");
    private static final By INVALID_FIRST_NAME_ERROR = By.xpath("//label[@for='prism-input-text-1']");
    private static final By INVALID_LAST_NAME_ERROR = By.xpath("//label[@for='prism-input-text-2']");
    private static final By INVALID_EMAIL_ERROR = By.xpath("//label[@for='prism-input-email-1']");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getREGISTRATION_PAGE_TITLE() { return WaiterManager.waitUntilElementIsVisible(driver, REGISTRATION_PAGE_TITLE); }
    public WebElement getFIRST_NAME_FIELD() {
        return driver.findElement(FIRST_NAME_FIELD);
    }
    public WebElement getLAST_NAME_FIELD() {
        return driver.findElement(LAST_NAME_FIELD);
    }
    public WebElement getEMAIL_FIELD() {
        return driver.findElement(EMAIL_FIELD);
    }
    public WebElement getPASSWORD_FIELD() {
        return driver.findElement(PASSWORD_FIELD);
    }
    public WebElement getPHONE_FIELD() {
        return driver.findElement(PHONE_FIELD);
    }
    public WebElement getCREATE_ACCOUNT_BUTTON() {
        return driver.findElement(CREATE_ACCOUNT_BUTTON);
    }
    public WebElement getINVALID_FIRST_NAME_ERROR() {
        return driver.findElement(INVALID_FIRST_NAME_ERROR);
    }
    public WebElement getINVALID_LAST_NAME_ERROR() {
        return driver.findElement(INVALID_LAST_NAME_ERROR);
    }
    public WebElement getINVALID_EMAIL_ERROR() {
        return driver.findElement(INVALID_EMAIL_ERROR);
    }
}
