package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

   @Given("I have browser opened")
    public void i_have_browser_opened() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Browser to be created and opened");

    }
    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user should login with actual valid or invalid usernames and passowrd");
    }
    @Then("I should be landed on home page")
    public void i_should_be_landed_on_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }


}
