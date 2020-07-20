package org.dep.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "user_email")
    private WebElement user_email;

    @FindBy(id = "user_password")
    private WebElement user_password;

    @FindBy(name= "commit")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open(){
        driver.get("http://kaala.herokuapp.com/users/sign_in");
        return this;
    }

    public LoginPage EnterUserDetails(String userName,String password){
        user_email.sendKeys(userName);
        user_password.sendKeys(password);
        return this;
    }

    public HomePage clickOnLoginButton() {
        loginButton.click();
        return new HomePage(driver);
    }

    public String verifyLoginPageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        return title;
    }
}
