package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SauceDemo_addToCart_one_item_and_remove_from_cart {


    //open the browser
    WebDriver driver ;
//    = new ChromeDriver();

    @BeforeMethod
    public  void beforeTest(){
        driver = new ChromeDriver();

        driver.switchTo().defaultContent();
                
        //navigate to the
        // url
        driver.get("https://www.saucedemo.com");
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }



    //annotation @
    @Test
    public void addToCart_one_item_and_remove_from_cart() throws InterruptedException {


        //enter the value - user name
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");


        // enter the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");


        //click the login button
        driver.findElement(By.name("login-button")).click();


        //verify title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching.");

        // Product page +++++++++++++++++

        //click 'Add to cart' button
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

        Thread.sleep(2000);

        //go to cart , cart page
        WebElement elm;
        elm = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        elm.click();

        //verify that you are in correct page
        String cartUrl = driver.getCurrentUrl();
        Assert.assertEquals(cartUrl, "https://www.saucedemo.com/cart.html", "URL is not same. Fail the test. no need to proceed further.");


        String expectedItemName = "Sauce Labs Backpack";

        //verify that item is added and available on the page
        String item1 = "//div[@class='inventory_item_name']";
        WebElement elmItem = driver.findElement(By.xpath(item1));
        String actualItemname = elmItem.getText();

        Assert.assertEquals(actualItemname, expectedItemName, "Item not added error");

        //remove the item
        driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-backpack']")).click();

        //the item should not available on the page
        String item_after_removing = "//div[@class='inventory_item_name']";
        List<WebElement> elm_after_removing = driver.findElements(By.xpath(item_after_removing));
        int count = elm_after_removing.size();

        Assert.assertEquals(0,count, "Item count not as 0, so item not removed.");


//         Boolean yesNo = elm_after_removing.isDisplayed();

//         if true then error
//            if false pass

//        Assert.assertFalse(yesNo, "Not removed, error");


        System.out.println("done");
    }


}
