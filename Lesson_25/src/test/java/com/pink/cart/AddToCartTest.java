package com.pink.cart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
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
    void addToCart() throws InterruptedException {
        WebElement accessoriesMenu = chromeDriver.findElement(By.xpath("//div[@class='sc-1lzvqrf-2 fWSvAv']//a[text()='ACCESSORIES']"));
        accessoriesMenu.click();
        Thread.sleep(1000);
        String link = chromeDriver.getCurrentUrl();
        Assertions.assertTrue(link.contains("accessories"));
        WebElement anyProduct = chromeDriver.findElement(By.xpath("//div[@class='sc-fehbe5-2 bMrFuC']"));
        anyProduct.click();
        Thread.sleep(500);
        WebElement productVariant = chromeDriver.findElement(By.xpath("//div[@class='sc-vsddgj-5 grPvkv']//span[@class='prism-danger-zone']//li[last()]"));
        String product = productVariant.getText();

        WebElement addToCartButton = chromeDriver.findElement(By.xpath("//button[@data-testid='AddToBagButtonEnhancement']"));
        addToCartButton.click();
        Thread.sleep(500);

        WebElement itemsInCart = chromeDriver.findElement(By.xpath("//section[@class='sub-total']/span"));
        Assertions.assertEquals("1 Items in Your Bag", itemsInCart.getText());

        WebElement productVariantInCart = chromeDriver.findElement(By.xpath("//p[@class='product-info-variant']/span"));
        Assertions.assertTrue(productVariantInCart.getText().equals(product));

    }
    @AfterAll
    static void tearDown() {
        chromeDriver.quit();
    }
}
