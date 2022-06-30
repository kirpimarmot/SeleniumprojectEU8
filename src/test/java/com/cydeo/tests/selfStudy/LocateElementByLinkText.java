package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByLinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //identify and save the About LINK ELEMENT ON THE TOP
        WebElement hakkındalink = driver.findElement(By.linkText("Hakkında"));

        //CLICK ON THE LINK
        hakkındalink.click();

        //close the browser
        driver.quit();
    }
}
