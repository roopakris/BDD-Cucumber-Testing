package org.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nopecommerce.LoginPage;
import org.nopecommerce.Utils;

public class LoginstepDefinition {


    LoginPage loginPage = new LoginPage();
    Utils utils = new Utils();

    @Given("user is on loginpage")
    public void user_is_on_loginpage() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("user Enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user should login to Nope")
    public void user_should_login_to_nope() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        loginPage.ivalidlogin();
        /////////Lgoin with valid credentials and should login successfully////////////
        loginPage.loginToPage();
        utils.closeBrowser();
    }
}
