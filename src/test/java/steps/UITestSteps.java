package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UITestSteps {

    WebDriver driver;

    @Given("Website is opened")
    public void website_is_opened() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();


        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


    }

    @When("User logged in with valid credentials")
    public void dsafdf() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        //enter username
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //click login button
        driver.findElement(By.name("login-button")).click();


    }

    @Then("User should be logged in to the website")
    public void user_should_be_logged_in_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();

        Assert.assertEquals(driver.getTitle(), "Swag Labs", "Title is not matching");

    }

    @Then("Browser is Closed")
    public void browser_is_closed() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.quit();


    }

    @When("User has the invalid credentials")
    public void user_has_the_invalid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should not be logged in to the website")
    public void user_should_not_be_logged_in_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Error message is displayed")
    public void error_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the sort dropdown")
    public void user_clicks_on_the_sort_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to choose sort order")
    public void user_should_be_able_to_choose_sort_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Products should be sorted as per the choice")
    public void products_should_be_sorted_as_per_the_choice() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects a product to add")
    public void user_selects_a_product_to_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Product should be added to the cart")
    public void product_should_be_added_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Count in the cart should be displayed")
    public void count_in_the_cart_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the remove button")
    public void user_clicks_on_the_remove_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Product should be removed from the cart")
    public void product_should_be_removed_from_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on the checkout button")
    public void user_clicks_on_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should navigate to the information page")
    public void user_should_navigate_to_the_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks continue button on Information page")
    public void user_clicks_continue_button_on_information_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should navigate to overview page")
    public void user_should_navigate_to_overview_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks finish button")
    public void user_clicks_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should checkout the product")
    public void user_should_checkout_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Thank you message is displayed {string}")
    public void thank_you_message_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User navigates to home page")
    public void user_navigates_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
