package stepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       //Code to navigate to login url
    	System.out.println("Navigated to Login URL");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Log in with username: "+ strArg1 +" and password: " + strArg2);
    	System.out.println("Login successfully");
    }

    @Then("^Home page is shown$")
    public void home_page_is_shown() throws Throwable {
        //Home page validation
    	System.out.println("Valitated home page");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(Boolean cards) throws Throwable {
        System.out.println("Cards validation");
        System.out.println(cards);
    }

}
