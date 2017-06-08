package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 08.06.17.
 */
public class GameProductSettingsPage {

    private static WebElement element =null;

    public static WebElement addIosUrl(WebDriver driver,String url){
        element= driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']"));
        element.sendKeys(url);
        return element;
    }

    public static WebElement submitIosLink (WebDriver driver){
        element= driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }

    public static WebElement advGameDomain (WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='themeinput_qUQeP BoxedInputinput_2H7nM BoxedInputinput_2H7nM BoxedInputlow_3KfXU']/input[@type='text']"));
        return element;
    }

    public static WebElement saveIosProduct (WebDriver driver){
        element= driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }

}
