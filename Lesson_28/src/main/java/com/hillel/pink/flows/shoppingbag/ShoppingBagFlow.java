package com.hillel.pink.flows.shoppingbag;

import com.hillel.pink.pages.shoppingbag.ShoppingBagPage;
import org.openqa.selenium.WebDriver;

public class ShoppingBagFlow {

    private ShoppingBagPage shoppingBagPage;

    public ShoppingBagFlow(WebDriver driver) {
        this.shoppingBagPage = new ShoppingBagPage(driver);
    }
}
