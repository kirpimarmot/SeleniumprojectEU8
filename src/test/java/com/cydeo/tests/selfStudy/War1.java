package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class War1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://www.facebook.com");

        String expectedTitle = "Facebook – log in or sign up";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as EXPECTED. Verification FAILED!");


        }
    }
}
