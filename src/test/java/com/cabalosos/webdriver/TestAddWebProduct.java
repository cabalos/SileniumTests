package com.cabalosos.webdriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.AddProductPage;
import pageObjects.LoginPage;
import pageObjects.WebProductSettingsPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 05.04.17.
 */

 public class TestAddWebProduct extends Abstract  {

    private static WebDriver driver;

    // data for test TestAddProduct(productName,domain,classname,error message after discrepancies,expected message)

    @DataProvider
    public static Object[][] testDataWE() {
        return new Object[][]{
                new Object[]{ "TESTWEB","http://madberry.net", "ViewscreenTitle_2oYz6", "Campaign doesn't created","TESTWEB"},
                new Object[]{ "","http://madberry.net", "error", "No validation message","Name is required"},
                new Object[]{ "KYKY","madberry.net", "error", "No validation message","Invalid link format"}
        };
    }

    @BeforeTest
    public	void logInFreya() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freya-test.singlehost-3.quple.rocks");
        LoginPage.loginField(driver).sendKeys("ihor.tkachenko@quple.io");
        LoginPage.passField(driver).sendKeys("1107");
        LoginPage.clickSubmit(driver);

    }

    @Test(dataProvider = "testDataWE")
    public void createWebProduct(String name,String domain,String classname,String errMes,String expMes ) throws AWTException, InterruptedException {
        AddProductPage.clickAddProduct(driver);
        AddProductPage.addWebProduct(driver);

        WebProductSettingsPage.uploadImageBut(driver);
        uploadFile("/home/cabal/Desktop/20170601_095252.jpg");
        WebProductSettingsPage.productName(driver,name);
        WebProductSettingsPage.advDomain(driver,domain);
        WebProductSettingsPage.submit(driver);

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname)));
        String textMes = driver.findElement(By.className(classname)).getText();
        Assert.assertTrue(errMes, textMes.contains(expMes));

        driver.quit();
    }
}


