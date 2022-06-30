package com.cydeo.tests.day6_Alerts_Ifrme_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day6_Task5_WindowHandle_Practice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void  setUpMethod() {
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");
    }

        @Test
        public void multiple_window_test(){

            //Storing the main page's handle as string
            //good practice for future re-usability purpose
            String mainHandle = driver.getWindowHandle();

            System.out.println("mainHandle = " + mainHandle);

            //4. Assert: Title is “Windows”
            String expectedTitle = "Windows";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitle);

            System.out.println("Title before click: "+actualTitle);

            //5. Click to: “Click Here” link
            WebElement clickHereButton = driver.findElement(By.xpath("//a[@target='_blank']"));
            clickHereButton.click();


            //6. Switch to new Window.
            /*
            Set<String> allWindowHandles =driver.getWindowHandles();
            // window handle 1- main window
            // window handle 2 - 2nd window
            for (String each : allWindowHandles() ) {
                driver.switchTo().window(each);
                System.out.println("Current title switching windows: "+driver.getTitle();
             */

            for (String each : driver.getWindowHandles() ) {
                driver.switchTo().window(each);
                System.out.println("Current title switching windows: "+driver.getTitle());
            }
            //7. Assert: Title is “New Window”
            String expectedTitleAfterClick = "New Window";
            actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitleAfterClick);

            System.out.println("Title after click: "+actualTitle);

            //If we want to go back to main page we can use already stored main handle
            //driver.switchTo().window(mainHandle);
        }

        //@AfterMethod
        //public void tearDown(){
        //driver.quit();}


    }

//TC #5: Window Handle practice
//
//1. Create a new class called: T5_WindowsPractice
//2. Create new test and make set ups
//3. Go to : https://practice.cydeo.com/windows
//4. Assert: Title is “Windows”
//5. Click to: “Click Here” link
//6. Switch to new Window.
//7. Assert: Title is “New Window”
