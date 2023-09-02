package com.hillel.pink.commonelementstest;

import com.hillel.driverfactory.abstractions.DriverManager;
import com.hillel.driverfactory.factory.DriverManagerFactory;
import com.hillel.driverfactory.utils.BrowserName;
import com.hillel.pink.flows.commonflows.HeaderFlow;
import com.hillel.pink.pages.commonelements.HeaderMenu;
import com.hillel.pink.pages.creditcard.CreditCardPage;
import com.hillel.pink.pages.shoppingbag.ShoppingBagPage;
import com.hillel.pink.utils.PopUpUtils;
import com.hillel.pink.utils.UrlChecks;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class HeaderFlowTest {

    private static DriverManager driverManager;
    private static WebDriver driver;
    private static HeaderMenu headerMenu;
    private static HeaderFlow headerFlow;
    private static ShoppingBagPage shoppingBagPage;
    private static CreditCardPage creditCardPage;

    @BeforeAll
    static void init() {
        driverManager = DriverManagerFactory.getDriverByName(BrowserName.CHROME);
        driver = driverManager.getDriver();
        headerMenu = new HeaderMenu(driver);
        headerFlow = new HeaderFlow(driver);
        shoppingBagPage = new ShoppingBagPage(driver);
        creditCardPage = new CreditCardPage(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.victoriassecret.com/us/pink");
        PopUpUtils.closeJoinLoyaltyProgramPopup(driver);
    }


    @Test
    void testAccountIcon() {
        if (!UrlChecks.doesCurrentUrlContain(driver, "pink")) headerFlow.returnToPinkHome();
        headerFlow.navigateToAccountIcon();
        Assertions.assertTrue(UrlChecks.doesCurrentUrlContain(driver, "account"));
    }

    @Test
    void testShoppingBagIcon() {
        if (!UrlChecks.doesCurrentUrlContain(driver, "pink")) headerFlow.returnToPinkHome();
        headerFlow.navigateToShoppingBagIcon();
        Assertions.assertTrue(shoppingBagPage.getSHOPPING_BAG_TITLE().getText().toUpperCase().contains("SHOPPING BAG"));
        headerFlow.closeShoppingBag();
    }

    @Test
    void testCreditCardIcon() {
        if (!UrlChecks.doesCurrentUrlContain(driver, "pink")) headerFlow.returnToPinkHome();
        headerFlow.navigateToCreditCardIcon();
        Assertions.assertTrue(creditCardPage.getCREDIT_CARD_TITLE().getText().contains("Credit Card"));
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
