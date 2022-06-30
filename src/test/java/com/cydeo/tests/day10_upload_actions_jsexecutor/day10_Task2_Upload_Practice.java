package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day10_Task2_Upload_Practice {

    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "/Users/kursatcevik/Desktop/HTML CLASS/cybertruck.jpeg";

        //3. Upload the file.
        WebElement choseFileButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        choseFileButton.sendKeys(path);

        WebElement fileUploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        fileUploadButton.click();

        //4. Assert: File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedHeader.isDisplayed() );

    }
}
//TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
//2. Find some small file from your computer, and get the path of it.
//3. Upload the file.
//4. Assert:
//-File uploaded text is displayed on the page