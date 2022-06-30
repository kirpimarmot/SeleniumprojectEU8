package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3Task1_locators_getTask {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement usernameInput = driver.findElement(By.className("login-inp"));
        usernameInput.sendKeys("incorrect");
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        //We may write the code as above but if we do we may not have a variable usernameInput for reusing

        //4- Enter incorrect password: “incorrect”
        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        //5- Click to login button.
        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessageText = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessageText.getText();
         if (actualErrorMessage.equals(expectedErrorMessage)){
             System.out.println("Verification Passed");
         }else{
             System.out.println("Verification FAILED!!");
         }

    }
}
