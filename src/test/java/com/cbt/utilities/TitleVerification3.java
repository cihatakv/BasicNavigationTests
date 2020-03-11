package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://walmart.com", "http://westelm.com");


        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String url : urls) {
            driver.get(url);
            String title = driver.getTitle().replace(" ", "").toLowerCase();
            if (url.contains(title)) {
                System.out.println(url + " -> TEST PASSED");
            } else {
                System.out.println(url + " -> TEST FAILED");
            }
            driver.quit();
        }



    }
}
