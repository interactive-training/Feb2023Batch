package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test1_step {

    WebDriver driver ;


    @Given("I have browser opened")
    public void i_have_browser_opened() {

        System.out.println("Browser to be created and opened");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");


    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {

        System.out.println("The user should login with actual valid or invalid usernames and passowrd");

        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //click login button
        driver.findElement(By.name("login-button")).click();

        System.out.println("Login licked");



    }


    @Then("I should be landed on home page")
    public void i_should_be_landed_on_home_page() {


        Assert.assertEquals(driver.getTitle(), "Swag Labs", "Title is not matchin.");


    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }


}


