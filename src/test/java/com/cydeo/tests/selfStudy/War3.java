package com.cydeo.tests.selfStudy;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class War3 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void test1(){
        WebElement createAPage = driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']"));

        String expected = "registration_form";
        String actual = createAPage.getText();
    }
}
//TC #4: Facebook header verification
//1. Open Chrome browser
//2. Go to https://www.facebook.com/
//3. Verify “Create a page” link href value contains text:
//Expected: “registration_form”