package com.hillel.driverfactory.factory;

import com.hillel.driverfactory.abstractions.DriverManager;
import com.hillel.driverfactory.drivers.ChromeDriverManager;
import com.hillel.driverfactory.drivers.EdgeDriverManager;
import com.hillel.driverfactory.utils.BrowserName;

public class DriverManagerFactory {
    public static DriverManager getDriverByName(BrowserName browserName) {
        DriverManager driverManager = null;
        switch (browserName) {
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            default:
                driverManager = new EdgeDriverManager();
        }
        return driverManager;
    }
}
