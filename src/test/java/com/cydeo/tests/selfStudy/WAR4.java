package com.cydeo.tests.selfStudy;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WAR4 {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
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
        Select stateSelectDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateSelectDropdown.selectByVisibleText("Illinois");

        List<WebElement> states = stateSelectDropdown.getOptions();
        for (WebElement each : states) {
            System.out.println(each.getText());
        }

        List<WebElement> links  =driver.findElements(By.id("state"));
        for (WebElement link : links) {
            System.out.println("link.getText() = " + link.getText());
        }
//4. Select Virginia
        stateSelectDropdown.selectByValue("VA");
//5. Select California
        stateSelectDropdown.selectByIndex(5);
//6. Verify final selected option is California.
        String expected = "California";
        String actual = stateSelectDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);

    }


}
//TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)