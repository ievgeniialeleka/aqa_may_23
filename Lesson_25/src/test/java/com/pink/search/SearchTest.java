package com.pink.search;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchTest {
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
    void testSearch() throws InterruptedException {
        WebElement searchField = chromeDriver.findElement(By.xpath("//input[@id='prism-input-search-1']"));
        searchField.sendKeys("swim");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        String link = chromeDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("swim"));
        List<WebElement> swimProducts = chromeDriver.findElements(By.xpath("//ins[@class='sc-1916wqc-0 bpTsSu prism-typography']//span[@class='prism-danger-zone']"));
        Assertions.assertTrue(swimProducts.stream()
                .map(WebElement::getText)
                .allMatch(p -> p.contains("$")));

        Assertions.assertTrue(swimProducts.stream()
                .map(WebElement::getText)
                .map(p -> p.replace("$", ""))
                .map(Double::parseDouble)
                .allMatch(p -> p > 0));

    }

    @Test
    void testSleepProducts() throws InterruptedException {
        WebElement sleepMenu = chromeDriver.findElement(By.xpath("//div[@class='sc-1lzvqrf-2 fWSvAv']//a[text()='SLEEP']"));
        sleepMenu.click();
        Thread.sleep(1000);
        WebElement coachPopUp = chromeDriver.findElement(By.xpath("//button[@data-testid='coachmark-button']"));
        coachPopUp.click();
        String link = chromeDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("sleep"));
        List<WebElement> sleepwear = chromeDriver.findElements(By.xpath("//div[@class='sc-2q3l14-0 gKqKpZ prism-layout-item-grid prism-layout-item sc-1rmr7ul-1 rqeeK']"));
        Assertions.assertTrue(sleepwear.size() > 0);
    }

    @AfterAll
    static void tearDown() {
        chromeDriver.quit();
    }
}
