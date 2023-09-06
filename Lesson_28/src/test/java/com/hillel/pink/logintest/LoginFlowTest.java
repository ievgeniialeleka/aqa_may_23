package com.hillel.pink.logintest;

import com.hillel.driverfactory.abstractions.DriverManager;
import com.hillel.driverfactory.factory.DriverManagerFactory;
import com.hillel.pink.flows.login.LoginFlow;
import com.hillel.pink.pages.login.LoginPage;
import com.hillel.pink.utils.PopUpUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.hillel.driverfactory.utils.BrowserName.CHROME;
public class LoginFlowTest {

    private static DriverManager driverManager;
    private static WebDriver driver;
    private static LoginPage loginPage;
    private static LoginFlow loginFlow;

    @BeforeAll
    static void init() {
        driverManager = DriverManagerFactory.getDriverByName(CHROME);
        driver = driverManager.getDriver();
        loginPage = new LoginPage(driver);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.victoriassecret.com/us/pink");
        PopUpUtils.closeJoinLoyaltyProgramPopup(driver);
    }

    @Test
    void testLoginNoEmailEntered() {
        loginFlow.getHeaderFlow().navigateToAccountIcon();
        loginFlow.enterPassword("somepassowrd");
        loginFlow.submitLoginInfo();
        Assertions.assertTrue(loginPage.getLOGIN_FIELD().equals(driver.switchTo().activeElement()));
        Assertions.assertEquals("Please correct the highlighted fields below.", loginPage.getINCOMPLETE_LOGIN_ERROR_MESSAGE().getText());
    }

    @Test
    void testLoginNoPasswordEntered() {
        loginFlow.getHeaderFlow().navigateToAccountIcon();
        loginFlow.enterEmail("someemail@gmail.com");
        loginFlow.submitLoginInfo();
        Assertions.assertTrue(loginPage.getPASSWORD_FIELD().equals(driver.switchTo().activeElement()));
        Assertions.assertEquals("Please correct the highlighted fields below.", loginPage.getINCOMPLETE_LOGIN_ERROR_MESSAGE().getText());
    }

    @Test
    void testLoginInvalidCredentials() {
        loginFlow.getHeaderFlow().navigateToAccountIcon();
        loginFlow.login("someemail@gmail.com", "somepassword");
        Assertions.assertTrue(loginFlow.isElementDisplayed(loginPage.getLOGIN_ERROR_MESSAGE()));
        Assertions.assertEquals("We do not recognize your sign-in information below. Please try again.", loginPage.getLOGIN_ERROR_MESSAGE().getText());
        loginFlow.navigateToRegistrationPage();
        Assertions.assertTrue(loginFlow.doesCurrentUrlContain(driver, "create"));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
