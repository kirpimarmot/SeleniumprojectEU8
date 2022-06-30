package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3Task2_getText_getAttribute {

    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equalsIgnoreCase(expectedRRememberMeLabel)){
            System.out.println("Verification remember me Label Passed");
        }else{
            System.out.println("Verification remember me Label FAILED!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected
        // : Forgot your password?

        WebElement forgetYourPassportLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgetYourPassportLink = "Forgot your password?";
        String actualForgetYourPassportLink =forgetYourPassportLink.getText();

        if (expectedForgetYourPassportLink.equalsIgnoreCase(expectedForgetYourPassportLink)){
            System.out.println("forgot password Link Verification  Passed");
        }else{
            System.out.println("forgot password Link Verification  FAILED!!!");
        }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expetedInHref = "forgot_password=yes";
        String actualInHref = forgetYourPassportLink.getAttribute("href");

        if (actualInHref.contains(expetedInHref)){
            System.out.println("HREF verification test passed");
        }else{
            System.out.println("HREF verification test FAILED!!!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
