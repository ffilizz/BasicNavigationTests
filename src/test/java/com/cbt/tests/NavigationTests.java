package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws Exception {
        testChrome();
        //testFirefox();
       // testSafari();
    }
    public static void testChrome() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        Thread.sleep(2000);
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility equality= new StringUtility();
        equality.verifyEquals(title,title3);
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        String title4=driver.getTitle();
        equality.verifyEquals(title2,title4);


        driver.quit();
    }
    public static void testFirefox() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        Thread.sleep(2000);
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility equality= new StringUtility();
        equality.verifyEquals(title,title3);
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        String title4=driver.getTitle();
        equality.verifyEquals(title2,title4);


        driver.quit();
    }
    public static void testSafari() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        Thread.sleep(2000);
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility equality= new StringUtility();
        equality.verifyEquals(title,title3);
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        String title4=driver.getTitle();
        equality.verifyEquals(title2,title4);


        driver.quit();
    }
}
