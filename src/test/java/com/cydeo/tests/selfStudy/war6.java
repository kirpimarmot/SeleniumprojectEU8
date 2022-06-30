package com.cydeo.tests.selfStudy;

import com.cydeo.pages.SubscriptionPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class war6 {

    @Test
    public void subscription(){
        SubscriptionPage subscriptionPage = new SubscriptionPage();
        Driver.getDriver().get("http://automationexercise.com/");

        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

       /*
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN, Keys.DOWN).perform();
        */

        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        //javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", subscriptionPage.subscription);

         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
         js.executeScript("window.scrollBy(0,350)", "");

        Faker faker =new Faker();

        subscriptionPage.inputBox.sendKeys(faker.name().username()+"@gmail.com");
        subscriptionPage.arrowBtn.click();


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        WebElement expected = Driver.getDriver().findElement(By.xpath("//div[.='You have been successfully subscribed!']"));
        wait.until(ExpectedConditions.visibilityOf(expected));

        Assert.assertTrue(expected.isDisplayed());









    }

}
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com/'
//3. Verify that home page is visible successfully
//4. Scroll down to footer
//5. Verify text 'SUBSCRIPTION'
//6. Enter email address in input and click arrow button
//7. Verify success message 'You have been successfully subscribed!' is visible

//To make the loaderMask etc elements disappear completely, using the invisibiltyOf() method works.
//
//But here is the problem, if we locate an element of type loaderMask with PageFactory class (with @FindBy annotation),
// then it doesn't give the exact result we want due to lazy initialization and implicitly wait.
//
//Instead, if we locate and assign it to a WebElement using the normal driver.findElement() method,
// and then use this WebElement with the invisibiltyOf() method, it gives exactly the result we expect.