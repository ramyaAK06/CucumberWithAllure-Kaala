Feature: Application for Leave functionality.

  As an employee of the company
  I want to login to the Kaala application with valid credentials
  In order to apply for leave

  Background: User navigates to Application URL
    Given User is present on login Page

  Scenario: Apply leave in the Kaala Application test Scenario

    When title of login page is Kaala
    Then User enters UserName "ramyak@testvagrant.com" and Password "ramya0074"
    Then User clicks on Login Button
    Then User should navigate to HomePage
    Then User should navigate to Leaves page
    Then User should click on New leaveButton
    Then User should select the type of leave, description and number of days
    Then User should select leave from and to dates 27 to 30
    Then User should apply for leave
