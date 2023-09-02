package com.pink.login;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private static WebDriver chromeDriver;

    @BeforeAll
    static void init() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.victoriassecret.com/us/pink");
        chromeDriver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement popUp = chromeDriver.findElement(By.xpath("//div[@class='sc-1phq5d0-1 dQDrzX']/div"));
        popUp.click();
        Thread.sleep(5000);
    }

    @Test
    void testLogin() throws InterruptedException {
        WebElement account = chromeDriver.findElement(By.xpath("//div[@class='sc-196dw0h-0 glOrOM prism-icon prism-icon-account']"));
        account.click();
        String link = chromeDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("signin"));

        Thread.sleep(3000);
        WebElement inputLogin = chromeDriver.findElement(By.xpath("//input[@id='prism-input-email-1']"));
        inputLogin.sendKeys("emailaddress@gmail.com");

        WebElement inputPassword = chromeDriver.findElement(By.xpath("//input[@id='prism-input-password-1']"));
        inputPassword.sendKeys("somepassword");

        WebElement loginButton = chromeDriver.findElement(By.xpath("//button[@data-testid='submit-signin-form']"));
        loginButton.click();

        Thread.sleep(1000);
        WebElement errorMessageOnLogin = chromeDriver.findElement(By.xpath("//span[@class='sc-1916wqc-0 idvvlT prism-typography']"));
        Assertions.assertTrue(errorMessageOnLogin.isDisplayed());
        Assertions.assertEquals("We do not recognize your sign-in information below. Please try again.", errorMessageOnLogin.getText());
    }

    @AfterAll
    static void tearDown() {
        chromeDriver.quit();
    }
}
