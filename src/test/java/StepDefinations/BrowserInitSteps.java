package StepDefinations;

import core.selenium.base.BrowserInitilization;
import core.selenium.enums.BrowserName;
import io.cucumber.java.en.Given;

public class BrowserInitSteps {

    BrowserInitilization driverManager = new BrowserInitilization();

    @Given("Browser is initialized")
    public void browser_is_initialized() {
        driverManager.startDriver(BrowserName.CHROME); // Or read from config
    }

}
