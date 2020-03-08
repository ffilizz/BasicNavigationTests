package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

        public static void main(String[] args) {

            WebDriver driver=BrowserFactory.getDriver("chrome");
            List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                    "https://wayfair.com", "https://walmart.com",
                    "https://westelm.com");

            for(String each:urls){
                driver=BrowserFactory.getDriver("chrome");
                driver.get(each);
                String title=driver.getTitle();
                title=title.replace(" ","").toLowerCase();
                BrowserUtils.wait(3);
                if(each.contains(title)){
                    System.out.println("Test PASSED!");
                }else{
                    System.out.println("Test FAILED!!");
                }
                BrowserUtils.wait(3);
                driver.close();

            }
            driver.quit();

    }

}
