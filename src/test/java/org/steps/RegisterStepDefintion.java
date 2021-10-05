package org.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nopecommerce.RegisterPage;
import org.nopecommerce.Utils;

public class RegisterStepDefintion {
    RegisterPage regsiter = new RegisterPage();
    Utils utils = new Utils();

    @Given("User is on register page")


    public void user_is_on_register_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi I am using Cucumber feature files to execute");

    }
    @When("User enters all the valid information and submits")
    public void user_enters_all_the_valid_information_and_submits() throws InterruptedException {

        regsiter.registration();
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User should see successful registration message")
    public void user_should_see_successful_registration_message() {
        // Write code here that turns the phrase above into concrete actions
       utils.closeBrowser();
    }
}
