package core.selenium.enums;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public enum BrowserName {

    CHROME{
        public WebDriver createDriver()
        {
            return WebDriverManager.chromedriver().create();

        }
    },
    FIREFOX{
        public WebDriver createDriver()
        {
            return WebDriverManager.firefoxdriver().create();
        }
    },
    EDGE{
        public WebDriver createDriver()
        {
            return WebDriverManager.edgedriver().create();
        }
    },
    SAFARI{
        public WebDriver createDriver()
        {
            return WebDriverManager.safaridriver().create();
        }
    };

    public abstract WebDriver createDriver();
  

}
