
package com.cabalosos.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginFreya {
    //   public static String driverPath = "C:/Program Files/";

    public  WebDriver login(String email, String password) {
        //       System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freya-test.quple.rocks");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button")).click();
        return driver;
    }

    @Test
    public void successLoginIn(){
        WebDriver driver = login("admin@admin.com", "shmadmin");
        String addproduct = driver.findElement(By.className("StatCarddescription_aNES8")).getText();
        Assert.assertTrue("Webpage doesn't load", addproduct.contains("ADD PRODUCT"));
        Assert.assertTrue(driver.getCurrentUrl().contains("http://freya-test.quple.rocks/#/"));
        driver.close();
    }

    @Test
    public void wrongPassword(){
        WebDriver driver = login("admin@admin.com", "shmadmin565");
        String texterror = driver.findElement(By.className("ErrorBlockerrorBlock_4O7t3")).getText();
        Assert.assertTrue("No validation message for login", texterror.contains("Username or password is invalid"));
        driver.close();
    }

    @Test
    public void wrongUsername(){
        WebDriver driver = login("klop@admin.com", "shmadmin");
        String texterror = driver.findElement(By.className("ErrorBlockerrorBlock_4O7t3")).getText();
        Assert.assertTrue("No validation message for login", texterror.contains("Username or password is invalid"));
        driver.close();
    }

    @Test
    public void emptyPassword(){
        WebDriver driver = login("admin@admin.com", "");
        String passrequired = driver.findElement(By.className("error")).getText();
        Assert.assertTrue("No message for required pass", passrequired.contains("Password is required"));
        driver.close();
    }

    @Test
    public void emptyUsername(){
        WebDriver driver = login("", "kykyky");
        String passrequired = driver.findElement(By.className("error")).getText();
        Assert.assertTrue("No message for required email", passrequired.contains("Email is required"));
        driver.close();
    }
}






