package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 14.06.17.
 */
public class AddFunnelPage {

    private static WebElement element = null;

    public static WebElement funnelName(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']"));
        element.sendKeys("NEW RICH FUNNEL");
        return element;
    }
    public static WebElement addFunnelStep(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@style='text-align: center;']/button[@class='themebutton_1iKuo FormButtonbutton_3huDH themeflat_2ui7t themeneutral_uDC3j']"));
        element.click();
        return element;
    }
    public static WebElement newStepName(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='Event name']"));
        element.sendKeys("NEW EVENT STEP");
        return element;
    }
    public static WebElement saveFunnelButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }








}
