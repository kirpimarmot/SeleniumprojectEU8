package com.cydeo.tests.selfStudy;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductBasket {
    @Test
    public void productBasket(){
        ////1. Launch browser
        ////2. Navigate to url 'http://automationexercise.com/'
        ////3. Verify that home page is visible successfully
        com.cydeo.pages.ProductBasket productBasket = new com.cydeo.pages.ProductBasket();
        Driver.getDriver().get("http://automationexercise.com/");

        String expected = "Automation Exercise";
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expected));

        ////4. Click 'Products' button
        productBasket.productsBtn.click();

        ////5. Hover over first product and click 'Add to cart'
        BrowserUtils.sleep(2);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", productBasket.addToChartBtn);

        productBasket.addToChartBtn.click();



        BrowserUtils.sleep(1);

        //6. Click 'Continue Shopping' button
        productBasket.continueShoppingBtn.click();

        ////7. Hover over second product and click 'Add to cart'
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", productBasket.addToCartBtn2);
        productBasket.addToCartBtn2.click();

        ////8. Click 'View Cart' button
        productBasket.viewCartBtn.click();

        ////9. Verify both products are added to Cart
        System.out.println("productBasket.allCellsRow1.getText() = " + productBasket.allCellsRow1.getText());
        System.out.println("productBasket.allCellsRow2.getText() = " + productBasket.allCellsRow2.getText());


        ////10. Verify their prices, quantity and total price





    }


}
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com/'
//3. Verify that home page is visible successfully
//4. Click 'Products' button
//5. Hover over first product and click 'Add to cart'
//6. Click 'Continue Shopping' button
//7. Hover over second product and click 'Add to cart'
//8. Click 'View Cart' button
//9. Verify both products are added to Cart
//10. Verify their prices, quantity and total price