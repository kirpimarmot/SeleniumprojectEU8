package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByName {

    public static void main(String[] args) {

        //Set up chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to google
        driver.get("https://google.com");

        //identify and sava the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        //enter text "selenium" and search for it
        searchBox.sendKeys("selenium"+ Keys.ENTER);

        //close the browser
        driver.quit();
    }
}
