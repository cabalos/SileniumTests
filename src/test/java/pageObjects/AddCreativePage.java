package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 14.06.17.
 */
public class AddCreativePage {

    private static WebElement element = null;

    public static WebElement creativeName(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']"));
        element.sendKeys("IMAGE TEST CREATIVE");
        return element;
    }


    public static WebElement imageUploadButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class='themebutton_1iKuo WideButtonbutton_2-ZSa themeraised_ONZv6 themeprimary_2NhN1']"));
        element.click();
        return element;
    }

    public static WebElement creativeSave(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }
}
