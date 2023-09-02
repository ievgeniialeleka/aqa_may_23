package com.hillel.pink.flows.login;

import com.hillel.pink.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public void enterEmail(String email) {
        loginPage.getLOGIN_FIELD().sendKeys(email);
    }
    public void enterPassword(String password) {
        loginPage.getPASSWORD_FIELD().sendKeys(password);
    }
    public void submitLoginInfo() {
        loginPage.getLOGIN_BUTTON().click();
    }
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        submitLoginInfo();
    }
    public void navigateToRegistrationPage() {
        loginPage.getREGISTRATION_BUTTON().click();
    }
}
