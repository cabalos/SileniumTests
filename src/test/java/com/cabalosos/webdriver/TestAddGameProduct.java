package com.cabalosos.webdriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AddProductPage;
import pageObjects.GameProductSettingsPage;
import pageObjects.LoginPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 07.06.17.
 */


public class TestAddGameProduct {

    private static WebDriver driver;

    @BeforeTest
    public	void logInFreya() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freya-test.singlehost-3.quple.rocks");
        LoginPage.loginField(driver).sendKeys("ihor.tkachenko@quple.io");
        LoginPage.passField(driver).sendKeys("1107");
        LoginPage.clickSubmit(driver);
    }

    @Test
    public void createGameProduct() throws AWTException, InterruptedException {

        AddProductPage.clickAddProduct(driver);
        Thread.sleep(100);
        AddProductPage.addIosProduct(driver);
        GameProductSettingsPage.addIosUrl(driver,"https://itunes.apple.com/us/app/township/id638689075");
        GameProductSettingsPage.submitIosLink(driver);

        GameProductSettingsPage.advGameDomain(driver).sendKeys("http://madberry.net");
        GameProductSettingsPage.saveIosProduct(driver);

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ViewscreenTitle_2oYz6")));
        String textMes = driver.findElement(By.className("ViewscreenTitle_2oYz6")).getText();
        Assert.assertTrue("Product doesn't created", textMes.contains("Township"));

        driver.quit();

    }
}
