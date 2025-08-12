package StepDefinations;

import core.selenium.pageFactory.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends HomePage {

    @Given("User navigates to the home page")
    public void navigates_to_the_home_page() {
        System.out.println("Navigarte to URL");
        navigateToHomePage("https://www.amazon.com/");
        pause(5000);
    }

    @Then("Searches for a {string}")
    public void searchesFor(String productName) {
        System.out.println("Searching for: " + productName);
        searchProduct(productName);
        pause(5000);
        moveTheSlider(-250);
        pause(5000);
    }

}
