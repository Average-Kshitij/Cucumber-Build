package core.selenium.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import core.selenium.enums.BrowserName;

public class BrowserInitilization {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public void startDriver(BrowserName browerName) {

        driverThread.set(browerName.createDriver());
        getDriverInstance().manage().window().maximize();
        getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

    public void clickButton(WebElement element)
    {   
        try{
        waitForElementToClickable(element);
        element.click();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void pause(long sleepTime){
        try{
        Thread.sleep(sleepTime);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void waitForElementToClickable(WebElement buttonElement)
    {
        WebDriverWait wait = new WebDriverWait(getDriverInstance(), Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.elementToBeClickable(buttonElement));
    }

   

    public void enterText(WebElement textBox, String textToEnter)
    {
        waitForElementToClickable(textBox);
        textBox.sendKeys(textToEnter);
    }

    public void clickToTheRightButton(WebElement element, String tagType)
    {
        WebElement button = getDriverInstance().findElement(
        RelativeLocator.with(By.tagName(tagType)).toRightOf(element)
    );
    button.click();
    }

    public void actionDragDrop(WebElement from , int offSet)
    {
        waitForElementToClickable(from);
        Actions a = new Actions(getDriverInstance());
        a.clickAndHold(from)
        .moveByOffset(-80, 0)
        .release()
        .perform();
    }
}
