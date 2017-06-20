package com.cabalosos.webdriver;

import net.madberry.configurations.ConfigLoader;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by cabal on 07.06.17.
 */
public class Abstract {

    //methods for robot(uploadFile)
    public static void setClipboardData(String pathToFile) {
        //StringSelection is a class that can be used for copy and paste operations.
        StringSelection stringSelection = new StringSelection(pathToFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static void uploadFile(String fileLocation) {
        try {
            //Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

   // method for set cookie

    public void setCookie(String name, String value, String domain, String path, Date expiry) {
        driver.manage().addCookie(
                new Cookie(name, value, domain, path, expiry));
    }



    public static WebDriver driver;


    public void logInFreya() {
        String host= ConfigLoader.config.hosts.get("freyaHost");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://"+host);
        LoginPage.loginField(driver).sendKeys("admin@admin.com");
        LoginPage.passField(driver).sendKeys("shmadmin");
        LoginPage.clickSubmit(driver);
    }

 //   WebDriverWait wait = new WebDriverWait(driver, 60);
 //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/input[@value='ADD CAMPAIGN' and @class='themeinputElement_27dyY themefilled_1UI7Z']")));

}





