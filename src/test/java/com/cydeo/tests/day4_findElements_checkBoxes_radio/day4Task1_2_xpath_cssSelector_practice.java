package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day4Task1_2_xpath_cssSelector_practice {
    public static void main(String[] args) {
        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link-- by using cssSelector
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //locate homelink by using cssSelector syntax2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        //locate homelink by using cssSelector with href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        //locate header by using cssSelector: locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example> h2"));

        //locate header by usingXPATH
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel_ex = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox_ex1= driver.findElement(By.xpath("//input[@name='email']"));

        //locate mailInputBox by using xpath contains method
        WebElement emailInputBox_ex2= driver.findElement(By.xpath("//input[contains(@pattern, 'z0-9')]"));


        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement passwordButton_ex= driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement powweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel_ex.isDisplayed() = " + emailLabel_ex.isDisplayed());
        System.out.println("passwordButton_ex.isDisplayed() = " + passwordButton_ex.isDisplayed());
        System.out.println("emailInputBox_ex1.isDisplayed() = " + emailInputBox_ex1.isDisplayed());
        System.out.println("passwordButton_ex.isDisplayed() = " + passwordButton_ex.isDisplayed());
        System.out.println("powweredByCydeoText.isDisplayed() = " + powweredByCydeoText.isDisplayed());


        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
