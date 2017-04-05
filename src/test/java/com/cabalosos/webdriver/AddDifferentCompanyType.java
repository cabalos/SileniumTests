package com.cabalosos.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by cabal on 05.04.17.
 */
public class AddDifferentCompanyType extends LoginFreya {

    @Test
    public void TypeCampaignIOS() {
       WebDriver driver = super.login("admin@admin.com","shmadmin");
       driver.findElement(By.className("StatCarddescription_aNES8")).click();
       driver.findElement(By.xpath("//img[@alt='ios game']")).click();
       driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']")).sendKeys("https://itunes.apple.com/ca/app/game-of-war-fire-age/id667728512");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
