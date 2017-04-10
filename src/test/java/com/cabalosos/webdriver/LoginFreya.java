
package com.cabalosos.webdriver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DiffButton;

public class LoginFreya extends DiffButton{
    //   public static String driverPath = "C:/Program Files/";
    //   System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");


    @Test
    public void successLogin(){
        WebDriver driver = logintofreya("admin@admin.com", "shmadmin");
        String addProduct = DiffButton.findClassname(driver,"StatCarddescription_aNES8").getText();
        Assert.assertTrue("Webpage doesn't load", addProduct.contains("ADD PRODUCT"));
        Assert.assertTrue(driver.getCurrentUrl().contains("http://freya-test.quple.rocks/#/"));
        driver.close();
    }

    @Test
    public void wrongPassword(){
        WebDriver driver = logintofreya("admin@admin.com", "shmadmin565");
        String textError = DiffButton.findClassname(driver,"ErrorBlockerrorBlock_4O7t3").getText();
        Assert.assertTrue("No validation message for logintofreya", textError.contains("Username or password is invalid"));
        driver.close();
    }

    @Test
    public void wrongUsername(){
        WebDriver driver = logintofreya("klop@admin.com", "shmadmin");
        String textError = DiffButton.findClassname(driver,"ErrorBlockerrorBlock_4O7t3").getText();
        Assert.assertTrue("No validation message for logintofreya", textError.contains("Username or password is invalid"));
        driver.close();
    }

    @Test
    public void emptyPassword(){
        WebDriver driver = logintofreya("admin@admin.com", "");
        String passMiss = DiffButton.findClassname(driver,"error").getText();
        Assert.assertTrue("No message for required pass", passMiss.contains("Password is required"));
        driver.close();
    }

    @Test
    public void emptyUsername(){
        WebDriver driver = logintofreya("", "kykyky");
        String userMiss = DiffButton.findClassname(driver,"error").getText();
        Assert.assertTrue("No message for required email", userMiss.contains("Email is required"));
        driver.close();
    }
}






