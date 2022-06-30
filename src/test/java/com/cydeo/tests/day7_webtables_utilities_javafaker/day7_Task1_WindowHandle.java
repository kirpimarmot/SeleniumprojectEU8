package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day7_Task1_WindowHandle {

    public WebDriver driver;
    //1. Create new test and make set ups
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test() {
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

       /* Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: "+driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")){ // By doing this we make the browser to stop at "etsy" page
                break;
            //So why we are doing this? because by using loop we call all the pages, but we cannot determine the page
                // through window handles (we dont know at which page it will stop). Tobe able to switch the page
                //we put a condition saying if the page's URL has "etsy", it should stop there
            }
        }

        //5. Assert: Title contains “Etsy”
        String expectedTitle ="etsy";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
*/

    }
}
//1. Create new test and make set ups
//2. Go to : https://www.amazon.com
//3. Copy paste the lines from below into your class
//4. Create a logic to switch to the tab where Etsy.com is open
//5. Assert: Title contains “Etsy”
//
//Lines to be pasted:
// ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
// ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
// ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//
//These lines will simply open new tabs using something called JavascriptExecutor
//and get those pages. We will learn JavascriptExecutor later as well.