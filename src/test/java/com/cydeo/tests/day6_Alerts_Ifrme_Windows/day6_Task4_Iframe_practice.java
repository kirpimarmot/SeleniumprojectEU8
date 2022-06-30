package com.cydeo.tests.day6_Alerts_Ifrme_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    //TC #4: Iframe practice
    //
    //1. Create a new class called: T4_Iframes
public class day6_Task4_Iframe_practice {
    WebDriver driver;
    //@BeforeMethod
    @BeforeClass
    public void  setUpMethod() {
    //2. Create new test and make set ups
    //3. Go to: https://practice.cydeo.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframeTest(){
        //We need to switch the driver's focus to iframe

        //Option #1 is switching to iframe using id attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //option 2# is passing index number of iframe
        //driver.switchTo().frame(0);

        //option3# is to locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


    //4. Assert: “Your content goes here.” Text is displayed.
        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHere.isDisplayed());



    //5. Assert/Verify: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //to be able to verify the header, we must switch bck to "main HTML"

        driver.switchTo().parentFrame();
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }

}
