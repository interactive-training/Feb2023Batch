package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SauceDemoLogin_Parameters {


    //open the browser
    WebDriver driver ;
//    = new ChromeDriver();

    @BeforeMethod
    @Parameters("Paramnname")
    public  void beforeTest(String Paramnname){

        System.out.println(Paramnname);


        driver = new ChromeDriver();

        driver.switchTo().defaultContent();
                
        //navigate to the
        // url
        driver.get("https://www.saucedemo.com");
    }

    //annotation @
    @Test(priority = 1)
    @Parameters("Paramnname")
    public void verifyStandardUser_1(String Paramnname) throws InterruptedException {


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

    }
//
//    @Test(priority = 2)
//    public void verifyLockedUser_2() throws InterruptedException {
//
//        //enter the value - user name
//        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("locked_out_user");
//
//
//        // enter the password
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//
//        //click the login button
//        driver.findElement(By.name("login-button")).click();
//
//
//        //verify
//        WebElement elmError = driver.findElement(By.xpath("//h3"));
//
//        System.out.println(elmError.getText());
//
//
////        Assert  - junit - deveopers
////                testng - Assert ++ - testing framework
////
////        testing frameworks - TESTNG
////        - BDD
//
//        //assertions
//        Assert.assertEquals(elmError.getText(),"Sorry, this user has been locked out.", "Error message is not same as expected.");
//
//    }
//
//    @Test(priority = 3)
//    public void verifyProblemUser_3() throws InterruptedException {
//
//
//        //enter the value - user name
//        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("problem_user");
//
//
//        // enter the password
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//
//        //click the login button
//        driver.findElement(By.name("login-button")).click();
//
//        //verify title
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Swag Labs";
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching.");
//
//
//
//    }
//
//    @Test(priority = 4)
//    public void verifyPerformanceUser_4() throws InterruptedException {
//
//
//        //enter the value - user name
//        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("performance_glitch_user");
//
//
//        // enter the password
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//
//        //click the login button
//        driver.findElement(By.name("login-button")).click();
//
//
//        //verify
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Swag Labs";
//        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching.");
//
//    }
//

    @AfterMethod
    public void closingmethod(){

        driver.close();
    }

}
