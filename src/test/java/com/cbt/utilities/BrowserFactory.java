package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows") && browser.equals("safari")) {
            return null;
        } else if (os.contains("mac") && browser.equals("edge")) {
            return null;
        } else {
            if (browser.equals("chrome")) {
                WebDriverManager.chromedriver().version("79.0").setup();
                return new ChromeDriver();
            } else if (browser.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            } else if (browser.equals("edge")) {
                WebDriverManager.edgedriver().version("79.0").setup();
                return new EdgeDriver();
            } else
                return null;
        }
    }
}
