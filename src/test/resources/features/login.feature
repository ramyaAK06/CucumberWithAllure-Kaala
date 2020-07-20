Feature: SignIn
  As an employee of the company
  I want to login to the Kaala application with my credentials
  In order to use the application features.

  Background: User navigates to Application URL
    Given User is present on login Page

  Scenario: login to Kaala Application test Scenario

    When title of login page is Kaala
    Then User enters UserName "ramyak@testvagrant.com" and Password "ramya0074"
    Then User clicks on Login Button
    Then User should navigate to HomePage
