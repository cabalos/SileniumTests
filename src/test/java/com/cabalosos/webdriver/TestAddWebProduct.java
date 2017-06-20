package com.cabalosos.webdriver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.AddProductPage;
import pageObjects.WebProductSettingsPage;

import java.awt.*;

/**
 * Created by cabal on 05.04.17.
 */

 public class TestAddWebProduct extends Abstract  {


    // data for test TestAddProduct(productName,domain,classname,error message after discrepancies,expected message)

    @DataProvider
    public static Object[][] testDataWE() {
        return new Object[][]{
                new Object[]{ "TESTWEB","http://madberry.net", "ViewscreenTitle_2oYz6", "Campaign doesn't created","TESTWEB"},
                new Object[]{ "","http://madberry.net", "error", "No validation message","Name is required"},
                new Object[]{ "KYKY","madberry.net", "error", "No validation message","Invalid link format"}
        };
    }
    @Test(dataProvider = "testDataWE")
    public void createWebProduct(String name,String domain,String classname,String errMes,String expMes ) throws AWTException, InterruptedException {
        logInFreya();
        AddProductPage.clickAddProduct(driver);
        AddProductPage.addWebProduct(driver);

        WebProductSettingsPage.uploadImageBut(driver);
        uploadFile("/home/cabal/Desktop/20170601_095252.jpg");
        WebProductSettingsPage.productName(driver,name);
        WebProductSettingsPage.advDomain(driver,domain);
        WebProductSettingsPage.submit(driver);

//        WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname)));
        Thread.sleep(500);
        String textMes = driver.findElement(By.className(classname)).getText();
        Assert.assertTrue(textMes.contains(expMes),errMes);
        driver.quit();
    }
}


