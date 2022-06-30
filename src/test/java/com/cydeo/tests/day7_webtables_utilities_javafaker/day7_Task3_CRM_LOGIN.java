package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class day7_Task3_CRM_LOGIN extends TestBase {


    //TC #3: Login scenario
    @Test
    public void crm_login_test(){
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInputBox.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logInInputBox = driver.findElement(By.xpath("//input[@type='submit']"));
        logInInputBox.click();

        //6. Verify title is as expected://Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_2(){
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //Calling the utility method to login helpdesk
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected://Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_3(){
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //Calling the utility method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected://Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

}
// 1. Create new test and make set ups
//2. Go to : http://login1.nextbasecrm.com/
//3. Enter valid username
//4. Enter valid password
//5. Click to `Log In` button
//6. Verify title is as expected:
//Expected: Portal
//USERNAME  PASSWORD
//helpdesk1@cybertekschool.com  UserUser
//Helpdesk2@cybertekschool.com  UserUser
//