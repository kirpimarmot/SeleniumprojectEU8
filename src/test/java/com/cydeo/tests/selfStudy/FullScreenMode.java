package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenMode {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the title
        driver.get("https://cydeo.com");

        //driver.manage().window().maximize();

        driver.manage().window().fullscreen();
    }
}
