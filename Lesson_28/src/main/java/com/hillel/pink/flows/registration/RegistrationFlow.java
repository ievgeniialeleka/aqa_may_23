package com.hillel.pink.flows.registration;

import com.hillel.pink.abstractions.AbstractFlow;
import com.hillel.pink.pages.registration.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow extends AbstractFlow {

    private RegistrationPage registrationPage;

    public RegistrationFlow(WebDriver driver) {
        super(driver);
        this.registrationPage = new RegistrationPage(driver);
    }

    public void enterFirstName(String firstName) { registrationPage.getFIRST_NAME_FIELD().sendKeys(firstName); }
    public void enterLastName(String lastName) {
        registrationPage.getLAST_NAME_FIELD().sendKeys(lastName);
    }
    public void enterEmail(String email) {
        registrationPage.getEMAIL_FIELD().sendKeys(email);
    }
    public void enterPassword(String password) {
        registrationPage.getPASSWORD_FIELD().sendKeys(password);
    }
    public void enterPhoneNumber(String phoneNumber) {
        registrationPage.getPHONE_FIELD().sendKeys(phoneNumber);
    }
    public void submitRegistrationInfo() {
        registrationPage.getCREATE_ACCOUNT_BUTTON().click();
    }
    public void registerWithAllFields(String firstName, String lastName, String email, String password, String phoneNumber) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
        enterPhoneNumber(phoneNumber);
        submitRegistrationInfo();
    }
    public void registerWithoutPhoneNumber(String firstName, String lastName, String email, String password) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
        submitRegistrationInfo();
    }
}
