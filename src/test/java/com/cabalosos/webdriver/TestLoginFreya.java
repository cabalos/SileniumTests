
package com.cabalosos.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestLoginFreya extends LoginPage {
    //   public static String driverPath = "C:/Program Files/";
    //   System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");

    private static WebDriver driver;

// data for test TestLoginFreya(email,password,classname,error message after discrepancies,expected message)
    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"ihor.tkachenko@quple.io", "1107", "StatCarddescription_aNES8", "Webpage doesn't load","ADD PRODUCT"},
                new Object[]{"ihor.tkachenkof@quple.io", "1107", "ErrorBlockerrorBlock_4O7t3","No validation message for login","Username or password is invalid"},
                new Object[]{"ihor.tkachenko@quple.io", "1108", "ErrorBlockerrorBlock_4O7t3", "No validation message for login","Username or password is invalid"},
                new Object[]{"ihor.tkachenko@quple.io", "", "error", "No message for required pass","Password is required" },
                new Object[]{"", "1107", "error", "No message for required email","Email is required"  },
                new Object[]{"&%$@#", "1107","ErrorBlockerrorBlock_4O7t3", "No validation message for login","Username or password is invalid" }
        };
    }


    @Test(dataProvider = "testData")
    public void testNew(String login, String pass, String classname,String errMes,String expMes) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freya-test.singlehost-3.quple.rocks");
        loginField(driver).sendKeys(login);
        passField(driver).sendKeys(pass);
        clickSubmit(driver);
        String textMes = driver.findElement(By.className(classname)).getText();
        Assert.assertTrue(textMes.contains(expMes), errMes);
        driver.quit();
    }
}












