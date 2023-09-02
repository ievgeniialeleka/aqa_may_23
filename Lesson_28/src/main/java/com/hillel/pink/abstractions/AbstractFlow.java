package com.hillel.pink.abstractions;

import com.hillel.pink.flows.commonflows.HeaderFlow;
import org.openqa.selenium.WebDriver;

public abstract class AbstractFlow {

    private HeaderFlow headerFlow;

    public AbstractFlow(WebDriver driver) {
        this.headerFlow = new HeaderFlow(driver);
    }

    public HeaderFlow getHeaderFlow() {
        return headerFlow;
    }
}
