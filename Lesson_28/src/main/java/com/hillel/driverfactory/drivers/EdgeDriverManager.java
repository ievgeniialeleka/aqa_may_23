package com.hillel.driverfactory.drivers;

import com.hillel.driverfactory.abstractions.DriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {
    public EdgeDriverManager() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
    }
}
