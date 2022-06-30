package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByClassName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //identify and save the "Türkiye" element
        WebElement turkeyText = driver. findElement(By.className("uU7dJb"));

        //verify the "Türkiye" text appear correctly
        if (turkeyText.getText().equals("Türkiye")) {
            System.out.println("Text appears correctly!");
        }else{
            System.out.println("Text does not appear correctly");
        }
        //close the browser

        driver.quit();
    }
}
