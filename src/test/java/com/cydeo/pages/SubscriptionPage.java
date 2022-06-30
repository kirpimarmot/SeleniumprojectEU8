package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {

public SubscriptionPage(){
    PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement inputBox;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrowBtn;



}
