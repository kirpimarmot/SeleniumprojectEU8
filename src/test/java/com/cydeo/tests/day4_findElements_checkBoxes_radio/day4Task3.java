package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class day4Task3 {
    public static void main(String[] args) {
        //XPATH Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("https://practice.cydeo.com/multiple_buttons ");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement displayedText = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        String expectedDisplayedText = "Clicked on button one!";
        String actualDispayedText = displayedText.getText();
        if (actualDispayedText.equals(expectedDisplayedText)) {
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification FAILED!!");
        }

        //
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
