package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by cabal on 06.04.17.
 */
public class LoginPage {

    private static WebElement element =null;

    public static WebElement loginField(WebDriver driver){
       element= driver.findElement(By.xpath("//div[@classname='QA_field_email']/input"));
       return element;
   }

   public static WebElement passField(WebDriver driver){
       element=driver.findElement(By.xpath("//div[@classname='QA_field_password']/input"));
       return element;
   }

    public  static WebElement clickSubmit (WebDriver driver){
        element=driver.findElement(By.xpath("//div[@classname='QA_field_submit']/input"));
        element.click();
        return element;
    }
}
