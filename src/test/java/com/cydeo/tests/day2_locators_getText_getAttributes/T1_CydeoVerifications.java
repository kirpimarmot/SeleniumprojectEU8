package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {
        //Tc #1: Cydeo practice tool verifications
        //1. Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");// we can also use driver.navigate().to();

        //3. Verify URL contains
        //Expected: Cydeo
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){//if(CurrentURL.contains("cydeo"); is also possible
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }


        //4. Verify title:
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){ // if (driver.getTitle().equals("Practice")); is also possible
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.close();


    }
}
