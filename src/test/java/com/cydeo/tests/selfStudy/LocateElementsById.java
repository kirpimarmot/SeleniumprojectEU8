package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsById {

    public static void main(String[] args) {

        //Set up chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //make the window maximized
        driver.manage().window().maximize();

        //navigate to google.com
        driver.get("https://google.com");

        //identify "Kendimi Şanslı Hissediyorum" element and save the element
        WebElement luckyText = driver.findElement(By.className("RNmpXc"));

        //find value of attribute
        String text = luckyText.getAttribute("value");

        //verify if value is "I'm Feeling Lucky"
        if (text.equals("Kendimi Şanslı Hissediyorum")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

    }
}
