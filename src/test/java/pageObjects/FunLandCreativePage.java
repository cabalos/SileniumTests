package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 13.06.17.
 */
public class FunLandCreativePage {

    private static WebElement element = null;

    public static WebElement funnelMenu(WebDriver driver) {
        element = driver.findElement(By.linkText("FUNNELS"));
        element.click();
        return element;
    }

    public static WebElement addFunnel(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@value='ADD FUNNEL']"));
        element.click();
        return element;
    }

    public static WebElement addRichWEbFunnel(WebDriver driver) {
        element = driver.findElement(By.xpath("//li[contains(text(), 'Rich media web conversion')]"));
        element.click();
        return element;
    }

    public static WebElement landingMenu(WebDriver driver) {
        element = driver.findElement(By.linkText("LANDINGS"));
        element.click();
        return element;
    }

    public static WebElement createLanding(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class='themebutton_1iKuo FormWideButtonbutton_1lh34 themeflat_2ui7t themeneutral_uDC3j']"));
        element.click();
        return element;
    }

    public static WebElement creativeMenu(WebDriver driver) {
        element = driver.findElement(By.linkText("CREATIVES"));
        element.click();
        return element;
    }

    public static WebElement addCreative(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@value='ADD CREATIVE']"));
        element.click();
        return element;
    }

    public static WebElement addImageCreative(WebDriver driver) {
        element = driver.findElement(By.xpath("//li[contains(text(), 'Image Banner')]"));
        element.click();
        return element;
    }

    public static WebElement campaignMenu(WebDriver driver) {
        element = driver.findElement(By.linkText("CAMPAIGNS"));
        element.click();
        return element;
    }

    public static WebElement addCampaign(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@value='ADD CAMPAIGN' ]"));
        element.click();
        return element;
    }

    public static WebElement addImageCampaign(WebDriver driver) {
        element = driver.findElement(By.xpath("//ul/li[contains(text(), 'Image Banner')]"));
        element.click();
        return element;
    }


}




