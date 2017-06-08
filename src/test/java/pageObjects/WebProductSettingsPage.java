package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 07.06.17.
 */
public class WebProductSettingsPage {

    private static WebElement element =null;

    public static WebElement uploadImageBut(WebDriver driver){
        element= driver.findElement(By.xpath("//button[@class='themebutton_1iKuo WideButtonbutton_2-ZSa themeraised_ONZv6 themeprimary_2NhN1']"));
        element.click();
        return element;
    }

    public static WebElement productName(WebDriver driver, String nameProduct){
        element= driver.findElement(By.xpath("//input[@type='text' and @class='themeinputElement_27dyY']"));
        element.sendKeys(nameProduct);
        return element;
    }

    public static WebElement advDomain(WebDriver driver,String domain){
        element= driver.findElement(By.xpath("//div[@class='themeinput_qUQeP BoxedInputinput_2H7nM BoxedInputinput_2H7nM BoxedInputlow_3KfXU']/input[@class='themeinputElement_27dyY']"));
        element.sendKeys(domain);
        return element;
    }

    public static WebElement submit (WebDriver driver){
        element= driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }

}
