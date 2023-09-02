package com.hillel.pink.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpUtils {
    private static final By JOIN_LOYALTY_PROGRAM_POPUP = By.xpath("//div[@class='sc-1phq5d0-1 dQDrzX']/div");
    private static final By COACH_POPUP = By.xpath("//button[@data-testid='coachmark-button']");

    private PopUpUtils() {
    }

    public static void closeJoinLoyaltyProgramPopup(WebDriver driver) {
        WaiterManager.waitUntilElementIsVisible(driver, JOIN_LOYALTY_PROGRAM_POPUP).click();
    }
    public static void closeCoachPopup(WebDriver driver) {
        WaiterManager.waitUntilElementIsVisible(driver, COACH_POPUP).click();
    }
}
