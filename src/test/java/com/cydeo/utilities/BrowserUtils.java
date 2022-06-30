package com.cydeo.utilities;
/*
In this class there are ONLY GENERAL utility methods that are NOT related to some specific page.
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

   /* this method will accept int (in seconds) and
   execute Thread.sleep for given duration */

    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : to verify if the url contains given String
        - If condition matches, it will break the loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: "+driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){ // By doing this we make the browser to stop at "etsy" page
                break;
                //So why we are doing this? because by using loop we call all the pages, but we cannot determine the page
                // through window handles (we dont know at which page it will stop). To be able to switch the page
                //we put a condition saying if the page's URL has "etsy", it should stop there
            }
        }

        //5. Assert: Title contains “expectedInTitle”
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    /*
    This method accepts a String "expectedTitle" and Assert if it is true
     */
    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

}
/*
TC #2: Create utility method
 1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.


Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
 */
