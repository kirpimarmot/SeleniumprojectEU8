package com.cydeo.tests.day6_Alerts_Ifrme_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day6_Task1_Task2_Task3_Alert_Practices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        //TC #1: Information alert practice
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        }

        @Test
        public void alert_test1(){
        //3. Click to “Click for JS Alert” button
            WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
            jsAlertButton.click();

        //4. Click to OK button from the alert
        //to be able to click Alert Ok button we need to switch driver's focus to Alert itself
            Alert alert = driver.switchTo().alert();
            alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
            WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

            //Failure message will only be displayed if assertion fails:
            Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

            String expectedText = "You successfully clicked an alert";
            String actualText = resultText.getText();

            Assert.assertEquals(expectedText, actualText, "Actual result text is not as expected!!!");


        }

        @Test
        public void alertTest2(){
            //1. Open browser
            //2. Go to website: http://practice.cydeo.com/javascript_alerts
            //3. Click to “Click for JS Confirm” button
            WebElement jsConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
            jsConfirmButton.click();

            //4. Click to OK button from the alert
            Alert alert = driver.switchTo().alert();//First we need to switch to Alert from HTML
            alert.accept();

            //5. Verify “You clicked: Ok” text is displayed.
            WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

            String expectedResultText = "You clicked: Ok";
            String actualResultText = resultText.getText();

            Assert.assertEquals(actualResultText,expectedResultText);


        }

        @Test
        public void alertTest3(){
            //1. Open browser
            //2. Go to website: http://practice.cydeo.com/javascript_alerts
            //3. Click to “Click for JS Prompt” button
            WebElement jsPromptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
            jsPromptButton.click();

            //4. Send “hello” text to alert
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("hello");

            //5. Click to OK button from the alert
            alert.accept();

            //6. Verify “You entered:  hello” text is displayed.
           WebElement resultText = driver.findElement(By.xpath("//p[.='You entered: hello']"));

           String expectedResultText = "You entered: hello";
           String actualResultText = resultText.getText();

            Assert.assertEquals(actualResultText,expectedResultText);

        }
        //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.
    //
    //TC #3: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    //4. Send “hello” text to alert
    //5. Click to OK button from the alert
    //6. Verify “You entered:  hello” text is displayed. 



}
