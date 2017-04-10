package com.cabalosos.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DiffButton;

import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 05.04.17.
 */
public class AddProductDifferentType extends DiffButton {


    @Test
    public void productTypeIOS() {
       WebDriver driver = super.logintofreya("admin@admin.com","shmadmin");
        DiffButton.findClassname(driver,"StatCardcross_A0rI8").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DiffButton.findClassname(driver,"StatCardios_2mhsB").click();
        driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']")).sendKeys("https://itunes.apple.com/ca/app/game-of-war-fire-age/id667728512");
        DiffButton.clickSubmit(driver);
        DiffButton.clickSubmit(driver);
    }
}


