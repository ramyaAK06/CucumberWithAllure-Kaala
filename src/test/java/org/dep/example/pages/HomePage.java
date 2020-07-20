package org.dep.example.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String verifyHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }
}
