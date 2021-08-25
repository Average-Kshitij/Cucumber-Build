package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page()  {
      System.out.println("User is on landing page");
    }
      
    @When("^User login into application using user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_using_user_name_something_and_password_something(String strArg1, String strArg2) {
    	System.out.println("User Name : "+ strArg1);
    	System.out.println("User Pass : "+ strArg2);
    }
    
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() {
       System.out.println("Home page is populated");
    }

    @And("^Cards display \"([^\"]*)\"$")
    public void cards_display_something(String strArg1) {
     
    	System.out.println("Cards displayed are : "+ strArg1);
    }
    
}
