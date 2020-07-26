package org.dep.example.steps;

import io.cucumber.java.en.Then;
import org.dep.example.config.PageObjectManager;
import org.dep.example.entities.LeaveType;
import org.dep.example.entities.NumberOfDays;

public class LeaveApplicationSteps{
    @Then("User should navigate to Leaves page")
    public void user_should_navigate_to_Leaves_page() {
        System.out.println("User is navigating to Leaves Page");
        PageObjectManager.getHomePage().navigateToLeavesPage();
    }

    @Then("User should click on New leaveButton")
    public void user_should_click_on_New_leaveButton() {
        System.out.println("User clicks on newLeave Button");
        PageObjectManager.getLeavesPage().clickOnNewLeaveButton();
    }

    @Then("User should select the type of leave and number of days")
    public void user_should_select_the_type_of_leave_and_number_of_days() {
        System.out.println("User selects Type of leave and Number of days for leave");
        PageObjectManager.getLeavesPage().selectLeaveType(LeaveType.Sick);
        PageObjectManager.getLeavesPage().selectNumberOfLeaves(NumberOfDays.TwoDays);
    }

    @Then("User should apply for leave")
    public void user_should_apply_for_leave() {
        System.out.println("User applies for leave");
        PageObjectManager.getLeavesPage().applyForLeave();
    }

}
