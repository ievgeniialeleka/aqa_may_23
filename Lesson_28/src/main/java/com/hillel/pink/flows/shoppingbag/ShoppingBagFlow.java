package com.hillel.pink.flows.shoppingbag;

import com.hillel.pink.abstractions.AbstractFlow;
import com.hillel.pink.pages.shoppingbag.ShoppingBagPage;
import org.openqa.selenium.WebDriver;

public class ShoppingBagFlow extends AbstractFlow {

    private ShoppingBagPage shoppingBagPage;

    public ShoppingBagFlow(WebDriver driver) {
        super(driver);
        this.shoppingBagPage = new ShoppingBagPage(driver);
    }
}
