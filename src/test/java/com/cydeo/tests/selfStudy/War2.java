package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class War2 {
    //TC #2: Facebook incorrect login title verification
    //1. Open Chrome browser
    //2. Go to https://www.facebook.com
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://www.facebook.com");
        //3. Enter incorrect username
        //4. Enter incorrect password
        //5. Verify title changed to:
        //Expected: “Log into Facebook”
    }
}
