package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebDriverDemo1 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver =  new ChromeDriver();

       driver.get("http://www.google.com");

       //test//

        String myTitle = driver.getTitle();
        System.out.println(myTitle);

        Thread.sleep(1000);

        //hanel cookies accept all

        driver.findElement(By.id("L2AGLb")).click(); //accept all


        driver.findElement(By.name("q")).sendKeys("Interactive training academy");

        //enter key
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);



        driver.close();


    }

}
