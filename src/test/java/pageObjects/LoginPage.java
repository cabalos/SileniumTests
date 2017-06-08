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
       element= driver.findElement(By.name("email"));
       return element;
   }

   public static WebElement passField(WebDriver driver){
       element=driver.findElement(By.name("password"));
       return element;
   }

    public  static WebElement clickSubmit (WebDriver driver){
        element=driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();
        return element;
    }
}
