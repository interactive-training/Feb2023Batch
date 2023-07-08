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

public class SauceDemo_addToCart_multiple_Items_And_remove_multipleItems {

    //open the browser
    WebDriver driver ;
//    = new ChromeDriver();

    @BeforeMethod
    public  void beforeTest(){
        driver = new ChromeDriver();

//        driver.switchTo().defaultContent();
                
        //navigate to the
        // url
        driver.get("https://www.saucedemo.com");
    }

    @AfterMethod
    public void closingmethod(){

        driver.close();
    }

    @Test
    public void addToCart_Multiple_Items_And_remove_All() throws InterruptedException {

        //login

        //enter the value - user name
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");

        // enter the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //click the login button
        driver.findElement(By.name("login-button")).click();


        //click add to cart for Item 1 (sauce labs backpack)
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //click 2nd item - Add to cart
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();


        //navigate to your cart
        driver.findElement(By.xpath("//div[@id = 'shopping_cart_container']/a")).click();

        //get the item count
        List<WebElement> itemNames = driver.findElements(By.xpath("//div[@class = 'cart_list']//div[@class='inventory_item_name']"));

        Assert.assertEquals(itemNames.size(),2, "count not matching.");

        // remove it
        List<WebElement> removeButtonSSSSSS = driver.findElements(By.xpath("//div[@class='cart_list']//button"));
        //
        for(int x=0; x<removeButtonSSSSSS.size(); x++){
            //get ONE button
            WebElement elm = removeButtonSSSSSS.get(x);
            elm.click();
        }

        //verfy items removed - how ???
        //verify item name count should be ZEROOOOOOOOOO
       itemNames = driver.findElements(By.xpath("//div[@class = 'cart_list']//div[@class='inventory_item_name']"));
        Assert.assertEquals(itemNames.size(),0, "Items are not removed. Failed");


        //continue shopping
        driver.findElement(By.name("continue-shopping")).click();


        Thread.sleep(5000);
    }


}
