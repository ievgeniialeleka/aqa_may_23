package com.hillel.pink.hometest;

import com.hillel.driverfactory.abstractions.DriverManager;
import com.hillel.driverfactory.factory.DriverManagerFactory;
import com.hillel.pink.flows.home.HomeFlow;
import com.hillel.pink.pages.home.HomePage;
import com.hillel.pink.utils.PopUpUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.hillel.driverfactory.utils.BrowserName.CHROME;

public class HomeFlowTest {
    private static DriverManager driverManager;
    private static WebDriver driver;
    private static HomePage homePage;
    private static HomeFlow homeFlow;

    @BeforeAll
    static void init() {
        driverManager = DriverManagerFactory.getDriverByName(CHROME);
        driver = driverManager.getDriver();
        homePage = new HomePage(driver);
        homeFlow = new HomeFlow(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.victoriassecret.com/us/pink");
        PopUpUtils.closeJoinLoyaltyProgramPopup(driver);
    }

    @Test
    void testSearchFromHomePage() {
        homeFlow.getHeaderFlow().navigateToPinkHome();
        homeFlow.enterValueIntoSearchBox("swim");
        Assertions.assertTrue(homeFlow.doesCurrentUrlContain(driver, "swim"));
    }

    @Test
    void testSleepWearMenuItem() {
        homeFlow.navigateToSleepWearPage();
        Assertions.assertTrue(homeFlow.doesCurrentUrlContain(driver, "sleepwear"));
        PopUpUtils.closeCoachPopup(driver);
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
