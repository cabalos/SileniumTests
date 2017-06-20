package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 06.06.17.
 */

public class AddProductPage {

    private static WebElement element =null;

    public static WebElement clickAddProduct(WebDriver driver){
        element= driver.findElement(By.className("StatCarddescription_aNES8"));
        element.click();
        return element;
    }

    public static WebElement addWebProduct(WebDriver driver){
        element= driver.findElement(By.xpath("//img[@alt='web']"));
        element.click();
        return element;
    }

    public static WebElement addIosProduct(WebDriver driver){
        element= driver.findElement(By.xpath("//div[@class='StatCardios_2mhsB']/img[@src='/static/media/game.dce61804.svg']"));
        element.click();
        return element;
    }

 /*   public static WebElement addAndroidProduct(WebDriver driver){
        element= driver.findElement(By.xpath("//img[@alt='android app']"));
        element.click();
        return element;
    }
 */

    public static WebElement clickLeftMenu(WebDriver driver){
        element= driver.findElement(By.xpath("//button[@class='themetoggle_1Zy-o themeneutral_uDC3j themeinverse_2Z8iZ']"));
        element.click();
        return element;
    }

 public static WebElement clickKnowledge(WebDriver driver){
        element= driver.findElement(By.linkText("KNOWLEDGE BASE"));
        element.click();
        return element;
    }

    public static WebElement clickTraffReporter(WebDriver driver){
        element= driver.findElement(By.linkText("TRAFFIC REPORTER"));
        element.click();
        return element;
    }

    public static WebElement clickAudienceList(WebDriver driver){
        element= driver.findElement(By.linkText("AUDIENCE LIST"));
        element.click();
        return element;
    }





}
