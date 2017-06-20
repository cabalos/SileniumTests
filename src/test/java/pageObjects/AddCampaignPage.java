package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 14.06.17.
 */
public class AddCampaignPage {

    private static WebElement element = null;

    public static WebElement creativeName(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@type='text' and @class='themeinputElement_27dyY']"));
        element.sendKeys("IMAGE TEST CREATIVE");
        return element;
    }
}
