package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByTagName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        //identify and save the "Test Automation Practice" element
        WebElement text = driver.findElement(By.tagName("h1"));

        //print out the text
        System.out.println(text.getText());

        //close the browser
        driver.quit();
    }
}
