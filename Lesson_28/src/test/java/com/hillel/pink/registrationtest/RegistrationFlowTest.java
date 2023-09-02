package com.hillel.pink.registrationtest;

import com.hillel.driverfactory.abstractions.DriverManager;
import com.hillel.driverfactory.factory.DriverManagerFactory;
import com.hillel.pink.flows.commonflows.HeaderFlow;
import com.hillel.pink.flows.login.LoginFlow;
import com.hillel.pink.flows.registration.RegistrationFlow;
import com.hillel.pink.pages.commonelements.HeaderMenu;
import com.hillel.pink.pages.registration.RegistrationPage;
import com.hillel.pink.utils.PopUpUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.hillel.driverfactory.utils.BrowserName.EDGE;

public class RegistrationFlowTest {

    private static DriverManager driverManager;
    private static WebDriver driver;
    private static LoginFlow loginFlow;
    private static RegistrationPage registrationPage;
    private static RegistrationFlow registrationFlow;
    private static HeaderMenu headerMenu;
    private static HeaderFlow headerFlow;
    private static Actions actions;

    @BeforeAll
    static void init() {
        driverManager = DriverManagerFactory.getDriverByName(EDGE);
        driver = driverManager.getDriver();
        loginFlow = new LoginFlow(driver);
        registrationPage = new RegistrationPage(driver);
        registrationFlow = new RegistrationFlow(driver);
        headerMenu = new HeaderMenu(driver);
        headerFlow = new HeaderFlow(driver);
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.victoriassecret.com/us/pink");
        PopUpUtils.closeJoinLoyaltyProgramPopup(driver);
    }

    @Test
    void testRegistrationInvalidFirstName() {
        actions.moveToElement(headerMenu.getACCOUNT_ICON()).build().perform();
        headerFlow.navigateToRegistrationLink();
        Assertions.assertEquals("Create an Account", registrationPage.getREGISTRATION_PAGE_TITLE().getText());
        registrationFlow.enterFirstName("123");
        registrationPage.getLAST_NAME_FIELD().click();
        Assertions.assertEquals("FIRST NAME CANNOT CONTAIN SPECIAL CHARACTERS OTHER THAN .'-", registrationPage.getINVALID_FIRST_NAME_ERROR().getText());
    }

    @Test
    void testRegistrationInvalidLastName() {
        headerFlow.navigateToAccountIcon();
        loginFlow.navigateToRegistrationPage();
        Assertions.assertEquals("Create an Account", registrationPage.getREGISTRATION_PAGE_TITLE().getText());
        registrationFlow.enterFirstName("Test");
        registrationFlow.enterLastName("123");
        registrationPage.getEMAIL_FIELD().click();
        Assertions.assertEquals("LAST NAME CANNOT CONTAIN SPECIAL CHARACTERS OTHER THAN .'-", registrationPage.getINVALID_LAST_NAME_ERROR().getText());
    }

    @Test
    void testRegistrationInvalidEmail() {
        headerFlow.navigateToAccountIcon();
        loginFlow.navigateToRegistrationPage();
        Assertions.assertEquals("Create an Account", registrationPage.getREGISTRATION_PAGE_TITLE().getText());
        registrationFlow.enterFirstName("Test");
        registrationFlow.enterLastName("Hillel");
        registrationFlow.enterEmail("testhillel");
        registrationPage.getPASSWORD_FIELD().click();
        String expectedError = "Please enter a valid email address.";
        Assertions.assertTrue(expectedError.equalsIgnoreCase(registrationPage.getINVALID_EMAIL_ERROR().getText()));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
