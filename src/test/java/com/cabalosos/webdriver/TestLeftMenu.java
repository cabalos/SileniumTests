package com.cabalosos.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AddProductPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 08.06.17.
 */
public class TestLeftMenu {


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
   public void checkItemLeftMenu() throws InterruptedException {
        AddProductPage.clickLeftMenu(driver);
        AddProductPage.clickKnowledge(driver);

        AddProductPage.clickLeftMenu(driver);
        AddProductPage.clickTraffReporter(driver);
    }
// No Assert!Only check clickable!
}
