package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

        /*
        this method will login with helpdesk@cybertekschool.com user when it is called
         */
    public static void crm_login(WebDriver driver){
        //3. Enter valid username
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInputBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@type='submit']"));
        logInInputBox.click();
    }
    public static void crm_login(WebDriver driver, String username, String password){
        //3. Enter valid username
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInputBox.sendKeys(username);

        //4. Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys(password);

        //5. Click to `Log In` button
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@type='submit']"));
        logInInputBox.click();
    }
}
