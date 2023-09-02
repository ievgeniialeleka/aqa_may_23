package com.hillel.pink.flows.home;

import com.hillel.pink.pages.home.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeFlow {

    private HomePage homePage;

    public HomeFlow(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }
    public void enterValueIntoSearchBox(String searchValue) {
        homePage.getPINK_HOME_PAGE_SEARCH_BOX().sendKeys(searchValue);
        homePage.getPINK_HOME_PAGE_SEARCH_BOX().sendKeys(Keys.ENTER);
    }
    public void navigateToSleepWearPage() { homePage.getSLEEP_MENU_ITEM().click(); }
}
