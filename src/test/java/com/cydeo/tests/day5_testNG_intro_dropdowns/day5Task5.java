package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day5Task5 {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
    //TC #5: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://practice.cybertekschool.com/dropdown");

    }
   @Test
   public void dropDownTest(){

   //3. Select Illinois
    Select stateSelectionDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
    stateSelectionDropDown.selectByVisibleText("Illinois");
    //4. Select Virginia
       stateSelectionDropDown.selectByValue("VA");
   //5. Select California
    stateSelectionDropDown.selectByIndex(5);

    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)
    //stateSelectionDropDown.getFirstSelectedOption();//this is the first option to verify
       String expectedOptionText = "California";
       String actualOptionText = stateSelectionDropDown.getFirstSelectedOption().getText();

       Assert.assertEquals(actualOptionText, expectedOptionText);



   }



}
