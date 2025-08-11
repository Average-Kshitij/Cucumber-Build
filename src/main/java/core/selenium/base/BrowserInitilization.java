package core.selenium.base;

import org.openqa.selenium.WebDriver;
import core.selenium.enums.BrowserName;

public class BrowserInitilization {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public void startDriver(BrowserName browerName) {

        driverThread.set(browerName.createDriver());

    }

    public WebDriver getDriverInstance()
    {
        return driverThread.get();
    }

    public void quitDriver()
    {
        if(driverThread.get() != null) {
            driverThread.get().quit();
            driverThread.remove();
        }
    }
}
