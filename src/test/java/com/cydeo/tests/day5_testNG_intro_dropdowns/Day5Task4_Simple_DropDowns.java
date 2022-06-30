package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5Task4_Simple_DropDowns {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropDownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        //WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();
        //String actualSimpleDropDownText = currentlySelectedOption.getText(); // Bu yontemlede yapilabilir ama is biraz uzuyor bence
        String actualSimpleDropDownText = simpleDropDown.getFirstSelectedOption().getText();
        String expectedSimpleDropDownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropDownText, expectedSimpleDropDownText);

        System.out.println(actualSimpleDropDownText);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));


        String actualStateSelectionDropDownText = stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelectionDropDownText = "Select a State";

        Assert.assertEquals(actualStateSelectionDropDownText, expectedStateSelectionDropDownText);
        //Assert.assertEquals(stateSelection.getFirstSelectedOption().getText(), "Select a State"); // This is another way of verifying the same value


    }
}
