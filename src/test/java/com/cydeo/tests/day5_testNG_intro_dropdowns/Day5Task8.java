package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day5Task8 {


            public WebDriver driver;

            @BeforeMethod
            public void setupMethod(){
                driver = WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                driver.get("https://practice.cydeo.com/dropdown");
            }
            @Test
            public void test1(){
                        Select select = new Select(driver.findElement(By.id("dropdown")));
                List<WebElement> dropdownOptions = select.getOptions();
                for (WebElement each : dropdownOptions) {
                    System.out.println(each.getText());
                   
                }

            }



        }

/*
 C #8: Selecting value from multiple select dropdown
 1. Open Chrome browser
 2. Go to https://practice.cydeo.com/dropdown
 3. Select all the options from multiple select dropdown.
 4. Print out all selected values.
 5. Deselect all values.
 */

