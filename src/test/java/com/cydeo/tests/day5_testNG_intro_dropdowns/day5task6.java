package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day5task6 {

    WebDriver driver;


@BeforeMethod
    public void setUpMethod(){
//TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/dropdown
    driver.get("https://practice.cydeo.com/dropdown ");

}

@Test
    public void dropDownTest(){
//3. Select “December 1st, 1923” and verify it is selected.
//Select year using  : visible text
//Select month using   : value attribute
//Select day using : index number
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));

    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));

    Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));

    yearDropdown.selectByVisibleText("1923");
    monthDropdown.selectByValue("11");
    dayDropdown.selectByIndex(0);

    //Creating expected values
    String expectedYear = "1923";
    String expectedMonth = "December";
    String expectedDay= "1";

    //getting actual values from browser
    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();

    //creating assertions
    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertEquals(actualMonth, expectedMonth);
    Assert.assertEquals(actualDay,expectedDay);

    }
    @AfterMethod
    public void tearDownMethod(){
    driver.close();
    }
}
