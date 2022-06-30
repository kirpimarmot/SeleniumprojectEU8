package com.cydeo.tests.selfStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class War5 {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://practice.cydeo.com/dropdown");

                WebElement dropDown = driver.findElement(By.cssSelector("#content > select:nth-child(21)"));

                Select select = new Select(dropDown);

                List<WebElement> options = select.getOptions();

                for (WebElement option: options) {
                    select.selectByValue(option.getAttribute("value"));

                }


            }
    }

