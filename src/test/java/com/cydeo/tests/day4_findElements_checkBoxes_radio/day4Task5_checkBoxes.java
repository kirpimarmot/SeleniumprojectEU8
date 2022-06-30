package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class day4Task5_checkBoxes {
    public static void main(String[] args) {
        //Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //We have to locate the checkBox1 and checkBox2 first
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected(), expected false = " + checkBox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected(), expected true = " + checkBox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(), expected true = " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected()expected false = " + checkBox2.isSelected());

        //        if (checkBox1.isSelected()){
        //            System.out.println("verification passed");
        //        }else{
        //            System.out.println("verification passed");
        //        }
        //
        //        if (checkBox2.isSelected()){
        //            System.out.println("verification passed");
        //        }else{
        //            System.out.println("verification passed");
    }
}
