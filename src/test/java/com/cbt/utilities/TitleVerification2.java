package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        WebDriver driver=BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com", "https://walmart.com",
                "https://westelm.com/");
         String title="";
        for(String each:urls){
            driver.get(each);
            title=driver.getTitle();
            title=title.replace(" ","").toLowerCase();
            BrowserUtils.wait(3);
            if(each.contains(title)){
                System.out.println("Test PASSED!!");
            }else{
                System.out.println("Test FAILED!!");
            }
        }

        BrowserUtils.wait(5);
        driver.quit();

    }
}
