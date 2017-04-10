package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 06.04.17.
 */
public class DiffButton {

    public  WebDriver logintofreya(String email, String password) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freya-test.quple.rocks");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        DiffButton.clickSubmit(driver);
        return driver;
    }

   private static WebElement element =null;

   public static WebElement clickSubmit(WebDriver driver){
       element= driver.findElement(By.xpath("//button[@type='submit']"));
       element.click();
       return element;
   }

   public static WebElement findClassname(WebDriver driver,String classname){
       element=driver.findElement(By.className(classname));
       return element;
   }

}
