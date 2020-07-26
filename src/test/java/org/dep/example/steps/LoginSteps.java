package org.dep.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dep.example.config.PageObjectManager;
import org.testng.Assert;

public class LoginSteps {

    @Given("User is present on login Page")
    public void navigateToLoginPage(){
        System.out.println("opening the loginPage base URl");
        PageObjectManager.getLoginPage().open();
    }

    @When("title of login page is Kaala")
    public void verifyPageTitle(){
        System.out.println("Verifying that the user is on right page for login fuctionality");
        String actualLoginPageTitle = PageObjectManager.getLoginPage().verifyLoginPageTitle();
        Assert.assertEquals("Kaala", actualLoginPageTitle);

    }

    @Then("User enters UserName {string} and Password {string}")
    public void AddUserDetails(String userName, String password){
        System.out.println("Entering UserName and Password");
        PageObjectManager.getLoginPage().EnterUserDetails(userName, password);
    }

    @Then("User clicks on Login Button")
    public void clicksOnLoginButton(){
        PageObjectManager.getLoginPage().clickOnLoginButton();
    }

    @Then ("User should navigate to HomePage")
    public void shouldNavigateToHomePageAndVerifyHomePageTitle(){

        System.out.println("Home Page title verification");
        String actualTitle = PageObjectManager.getHomePage().verifyHomePageTitle();
        Assert.assertEquals("Kaala1", actualTitle);
    }
}
