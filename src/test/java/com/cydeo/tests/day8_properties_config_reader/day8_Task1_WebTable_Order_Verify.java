package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day8_Task1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){
        //locate teh cell that has BOb Martin text in it
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[7]/td[.='Bob Martin']"));
        //System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.//Expected: “Bob Martin”
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();
        Assert.assertEquals(actualBobName, expectedBobName);

        //3. Verify Bob Martin’s order date is as expected //Expected: 12/31/2021
        WebElement bobMartinDateCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[7]/td[.='Bob Martin']//following-sibling::td[3]"));

        String expectedBobDateCell = "12/31/2021";
        String actualBobDateCell = bobMartinDateCell.getText();

        Assert.assertEquals(actualBobDateCell, expectedBobDateCell);

    }

    //We use the utility method we created
    @Test
    public void test2(){
        String customerOrderDate1 = WebTablesUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTablesUtils.returnOrderDate(driver, "John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate1);
    }

    //Using webTableUtils.orderVerify(): method
    @Test
    public void test3(){
        WebTablesUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");
    }

}
//TC #1: Web table practice
// 1. Go to: https://practice.cydeo.com/web-tables
//2. Verify Bob’s name is listed as expected.
//Expected: “Bob Martin”
//3. Verify Bob Martin’s order date is as expected
//Expected: 12/31/2021
