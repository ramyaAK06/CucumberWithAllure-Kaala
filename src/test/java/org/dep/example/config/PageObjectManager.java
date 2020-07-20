package org.dep.example.config;

import org.dep.example.pages.HomePage;
import org.dep.example.pages.LoginPage;

public class PageObjectManager {

  private static LoginPage loginPage;
  private static HomePage homePage;

    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(WebDriverManager.getWebDriver());
        }
        return loginPage;
    }

    public static HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(WebDriverManager.getWebDriver());
        }
        return homePage;
    }


  public static void resetPageObjects() {
    loginPage = null;
    homePage = null;
  }
}
