package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args)  {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        List<String> titles = new ArrayList<>();
        String title = "";
        for (String eachUrl : urls) {
            driver.get(eachUrl);
            BrowserUtils.wait(5);
            title= driver.getTitle();
            titles.add(title);
           // System.out.println("title = " + title);
        }
        System.out.println(titles);
        boolean isEqual = true;
        for (int i = 0; i < titles.size() - 1; i++) {
            if (!titles.get(i).equals(titles.get(i+1))) {
                isEqual=false;
                break;
            }
        }if(isEqual==true) {
            System.out.println("Test PASSED!");
        }else{
            System.out.println("Test FAILED!");
        }
        driver.quit();
    }
}
