package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition 
{

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable 
    {
    	//redirect to netbanking landing page
    	System.out.println("navigated to login URL");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable 
    {
        //login with username and password
    	System.out.println("Logged in successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable 
    {
        //home page validation
    	System.out.println("validated home page");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable 
    {
        //validate cards
    	System.out.println("validated cards");
    }

}