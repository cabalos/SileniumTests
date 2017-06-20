package com.cabalosos.webdriver;

import org.testng.annotations.Test;
import pageObjects.*;

import java.awt.*;

/**
 * Created by cabal on 07.06.17.
 */


public class TestAddGameProduct extends Abstract {



    @Test
    public void createGameProduct() throws AWTException, InterruptedException {
        logInFreya();
       driver.manage().window().maximize();
        AddProductPage.clickAddProduct(driver);
        Thread.sleep(500);
        AddProductPage.addIosProduct(driver);

        GameProductSettingsPage.addIosUrl(driver,"https://itunes.apple.com/us/app/township/id638689075");
        GameProductSettingsPage.submitIosLink(driver);
        GameProductSettingsPage.advGameDomain(driver).sendKeys("http://madberry.net");
        GameProductSettingsPage.saveIosProduct(driver);
        Thread.sleep(500);

        FunLandCreativePage.funnelMenu(driver);
        FunLandCreativePage.addFunnel(driver);
        FunLandCreativePage.addRichWEbFunnel(driver);
        AddFunnelPage.funnelName(driver);
        AddFunnelPage.addFunnelStep(driver);
        AddFunnelPage.newStepName(driver);
        AddFunnelPage.saveFunnelButton(driver);

        FunLandCreativePage.landingMenu(driver);
        FunLandCreativePage.createLanding(driver);
        AddLandingPage.landingName(driver);
        AddLandingPage.clickThroughUrl(driver);
        AddLandingPage.landingUrl(driver);
        AddLandingPage.saveLandingButton(driver);

        FunLandCreativePage.creativeMenu(driver);
        FunLandCreativePage.addCreative(driver);
        FunLandCreativePage.addImageCreative(driver);
        AddCreativePage.creativeName(driver);
        AddCreativePage.imageUploadButton(driver);
        uploadFile("/home/cabal/Desktop/belko.jpeg");
        Thread.sleep(1000);
        AddCreativePage.creativeSave(driver);

        FunLandCreativePage.campaignMenu(driver);
        FunLandCreativePage.addCampaign(driver);
        FunLandCreativePage.addImageCampaign(driver);

        AddCampaignPage.creativeName(driver);


    }
}
