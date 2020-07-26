package org.dep.example.pages;

import org.dep.example.entities.LeaveType;
import org.dep.example.entities.NumberOfDays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;
import java.util.List;

public class LeavesPage extends AbstractPage{

    public LeavesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= "away_leave_type")
    private List<WebElement> leaveType;

    @FindBy(css = "body > div > a")
    private WebElement newLeaveButton;

    @FindBy(name="commit")
    private WebElement submitLeaveButton;

    @FindBy(id= "away_num_of_days")
    private List<WebElement> numberOfDays;

    @FindBy(id="away_description")
    private WebElement away_description;

    @FindBy(xpath="//td[contains(text(),'13')]")
    private WebElement away_from_date;

    @FindBy(xpath="//td[contains(text(),'27')]")
    private WebElement away_to_date;

    @FindBy(className="datepicker-switch")
    private List<WebElement> month_picker_switch;


    public LeavesPage selectLeaveType(LeaveType leave){
        for(int i=0;i<leaveType.size();i++){
           if(leaveType.get(i).getText().equals(leave)){
               leaveType.get(i).click();
           }
        }
        return this;
    }

    public LeavesPage clickOnNewLeaveButton(){
         newLeaveButton.click();
         return this;
    }

    public LeavesPage selectNumberOfLeaves(NumberOfDays days){
        for(int i=0;i<numberOfDays.size();i++){
            if(numberOfDays.get(i).getText().equals(days)) {
                numberOfDays.get(i).click();
            }
            break;
        }
        return this;
    }

    public void applyForLeave(){
        submitLeaveButton.click();
    }

    public LeavesPage addLeaveDescription(String description){
        away_description.sendKeys(description);
        return this;
    }

    public LeavesPage selectFromDate(int date){
        driver.findElement(By.name("away[from_date]")).click();
        driver.findElement(By.xpath("//td[contains(text(),"+date+")]")).click();
       return this;
    }
    public LeavesPage selectToDate(int date){
        driver.findElement(By.name("away[to_date]")).click();
        driver.findElement(By.xpath("//td[contains(text(),"+date+")]")).click();
        return this;
    }
}
