package org.dep.example.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

class WebDriverManager {

    private static WebDriver driver;

    static WebDriver getWebDriver() {
        if (driver == null) {
            resetWebDriver();
        }
        return driver;
    }

    static void resetWebDriver() {

        String browser = System.getProperty("BROWSER");

        if (browser == null) {
            browser = System.getenv("BROWSER");
            if (browser == null) {
                browser = "chrome";
            }
        }

        switch (browser) {

            case "firefox":
                io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "edge":
                io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "chrome":
            default:
                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
        System.out.println("Opening Browser...." + browser);
    }
}
