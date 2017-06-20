package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by cabal on 14.06.17.
 */
public class AddLandingPage {

    private static WebElement element = null;

    public static WebElement landingName(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("//input[@class='themeinputElement_27dyY']"));
        elements.get(0).sendKeys("NEW TEST LANDING");
        return element;
    }

    public static WebElement clickThroughUrl(WebDriver driver) {
     //   element=driver.findElement(By.xpath(".//*[@id=\"app-body\"]/div/div/div/form/div[1]/div[3]/div[2]/div[2]/div/input"));
        List<WebElement> elements = driver.findElements(By.xpath("//input[@class='themeinputElement_27dyY']"));
        elements.get(0).sendKeys("http://omgtest.com");
        return element;
    }

    public static WebElement landingUrl(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("//input[@class='themeinputElement_27dyY']"));
        elements.get(0).sendKeys("http://newtest.com");
        return element;
    }

    public static WebElement saveLandingButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;

    }

}