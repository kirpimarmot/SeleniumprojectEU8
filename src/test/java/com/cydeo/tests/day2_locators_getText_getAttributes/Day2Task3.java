package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task3 {
    public static void main(String[] args) {
        //TC#3: Google search
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write “apple” in search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //4- Click google search button
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expetedTitle ="apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expetedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title Verification failed");
        }


    }

}