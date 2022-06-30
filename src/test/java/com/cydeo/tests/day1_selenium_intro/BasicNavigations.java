package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance eof the Selenium WebDriver
        // This the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        // This line will maximize the browser size
        driver.manage().window().maximize();

        // This line will maximize the browser size, just working for mac
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //Get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Get the current URL by using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use navigate().to():
        driver.navigate().to("https://www.google.com");

        // get the current title after getting the google page
        currentTitle = driver.getTitle();

        
        //System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println("currentTitle = " + currentTitle);


        //Get the current URL by using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        //This will close the currently open window
        driver.close();


        //This will close the all the opened windows which means it kills the current session
        driver.quit();



    }

}
