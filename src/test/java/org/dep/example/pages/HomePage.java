package org.dep.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "li a[href='/aways']")
    private WebElement leavesButton;

    public String verifyHomePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }

    public LeavesPage navigateToLeavesPage(){
        leavesButton.click();
        return new LeavesPage(driver);
    }
}
