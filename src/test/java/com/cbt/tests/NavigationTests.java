package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {

        WebDriver chromeDriver = BrowserFactory.getDriver("chrome");

        chromeDriver.get("https://www.google.com");
        String googleTitle = chromeDriver.getTitle();
        chromeDriver.navigate().to("https://www.etsy.com");
        chromeDriver.navigate().back();
        String etsyTitle = chromeDriver.getTitle();
        System.out.println(StringUtility.verifyEquals(googleTitle, etsyTitle));
        chromeDriver.quit();

        WebDriver firefoxDriver = BrowserFactory.getDriver("firefox");
        firefoxDriver.get("https://www.google.com");
        googleTitle = firefoxDriver.getTitle();
        firefoxDriver.navigate().to("https://www.etsy.com");
        firefoxDriver.navigate().back();
        etsyTitle = firefoxDriver.getTitle();
        System.out.println(StringUtility.verifyEquals(googleTitle, etsyTitle));
        firefoxDriver.quit();

        WebDriver edgeDriver = BrowserFactory.getDriver("edge");
        edgeDriver.get("https://www.google.com");
        googleTitle = edgeDriver.getTitle();
        edgeDriver.navigate().to("https://www.etsy.com");
        edgeDriver.navigate().back();
        etsyTitle = edgeDriver.getTitle();
        System.out.println(StringUtility.verifyEquals(googleTitle, etsyTitle));
        edgeDriver.quit();

    }
}
