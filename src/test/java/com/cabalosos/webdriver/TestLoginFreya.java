
package com.cabalosos.webdriver;

import net.madberry.configurations.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import java.lang.*;

import java.util.concurrent.TimeUnit;

public class TestLoginFreya extends LoginPage {
  //    public static String driverPath =
  //    System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");

    private static WebDriver driver;

// data for test TestLoginFreya(email,password,classname,error message after discrepancies,expected message)
    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"admin@admin.com", "shmadmin", "StatCarddescription_aNES8", "Webpage doesn't load","ADD PRODUCT"},
                new Object[]{"pladmin@admin.com", "shmadmin", "ErrorBlockerrorBlock_4O7t3","No validation message for login","Username or password is invalid"},
                new Object[]{"admin@admin.com", "gogo", "ErrorBlockerrorBlock_4O7t3", "No validation message for pass","Username or password is invalid"},
                new Object[]{"admin@admin.com", "", "error", "No message for required pass","Password is required" },
                new Object[]{"", "shmadmin", "error", "No message for required email","Email is required"  },
                new Object[]{"&%$@#", "shmadmin","ErrorBlockerrorBlock_4O7t3", "No validation message for login","Username or password is invalid" }
        };
    }


    @Test(dataProvider = "testData")
    public void testNew(String login, String pass, String classname,String errMes,String expMes) {
        String host= ConfigLoader.config.hosts.get("freyaHost");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://"+host);
        loginField(driver).sendKeys(login);
        passField(driver).sendKeys(pass);
        clickSubmit(driver);
        String textMes = driver.findElement(By.className(classname)).getText();
        Assert.assertTrue(textMes.contains(expMes), errMes);
        driver.quit();
    }
}













