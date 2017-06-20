package com.cabalosos.webdriver;

import org.testng.annotations.Test;
import pageObjects.AddProductPage;

/**
 * Created by cabal on 08.06.17.
 */
public class TestLeftMenu extends Abstract {



    @Test
   public void checkItemLeftMenu() throws InterruptedException {
        logInFreya();
        AddProductPage.clickLeftMenu(driver);
        AddProductPage.clickKnowledge(driver);

        AddProductPage.clickLeftMenu(driver);
        AddProductPage.clickAudienceList(driver);

        AddProductPage.clickTraffReporter(driver);

        driver.quit();
    }
// No Assert!Only check clickable!
}
