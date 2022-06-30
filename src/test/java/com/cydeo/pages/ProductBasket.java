package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductBasket {

    public ProductBasket(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsBtn;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public  WebElement addToChartBtn;

    @FindBy(xpath = "//button[.='Continue Shopping']")
    public  WebElement continueShoppingBtn;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement addToCartBtn2;

    @FindBy(xpath = "//u")
    public WebElement viewCartBtn;

    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement allCellsRow1;

    @FindBy(xpath = "//tr[@id='product-2']")
    public WebElement allCellsRow2;


}
