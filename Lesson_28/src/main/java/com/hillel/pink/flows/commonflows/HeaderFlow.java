package com.hillel.pink.flows.commonflows;

import com.hillel.pink.pages.commonelements.HeaderMenu;
import org.openqa.selenium.WebDriver;

public class HeaderFlow {

    private HeaderMenu headerMenu;

    public HeaderFlow(WebDriver driver) {
        this.headerMenu = new HeaderMenu(driver);
    }

    public void navigateToAccountIcon() {
        headerMenu.getACCOUNT_ICON().click();
    }
    public void navigateToRegistrationLink() { headerMenu.getREGISTRATION_LINK().click(); }
    public void navigateToShoppingBagIcon() { headerMenu.getSHOPPING_BAG_ICON().click(); }
    public void navigateToCreditCardIcon() {headerMenu.getCREDIT_CARD_ITEM().click(); }
    public void closeShoppingBag() { headerMenu.getCLOSE_SHOPPING_BAG_BUTTON().click(); }
    public void returnToPinkHome() { headerMenu.getPINK_HOME_ICON().click(); }
}
