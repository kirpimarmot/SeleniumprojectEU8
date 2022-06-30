package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3Task3_getAttribute_sccSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //WebElement logInButtonText = driver.findElement(By.className("login-btn"));
        WebElement logInButtonText = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLogInButtonText = "Log In";
        String actualLogInButtonText = logInButtonText.getAttribute("value");
        System.out.println("actualLogInButtonText = " + actualLogInButtonText);

        if (actualLogInButtonText.equals(expectedLogInButtonText)){
            System.out.println("LogIn button test Passed");
        }else{
            System.out.println("LogIn button test FAILED!!!");
        }
        //
        //
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
