package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String url : urls) {

            driver.get(url);
            Thread.sleep(3000);
            String title = driver.getTitle().replace(" ", "").toLowerCase();
            if (url.contains(title)) {
                System.out.println(url + " -> TEST PASSED");
            } else {
                System.out.println(url + " -> TEST FAILED");
            }

        }

        driver.quit();


    }
}
