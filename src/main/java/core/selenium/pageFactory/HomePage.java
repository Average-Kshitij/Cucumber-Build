package core.selenium.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.selenium.base.BrowserInitilization;

public class HomePage extends BrowserInitilization{

        @FindBy(id="nav-search-submit-button") private WebElement we_SearchButton;
        @FindBy(xpath="//button[@type='submit']") private WebElement we_continueShopping;  
        @FindBy(id="twotabsearchtextbox") private WebElement we_searchBox;
        @FindBy(id="p_36/range-slider_slider-item_upper-bound-slider") private WebElement we_priceSliderUpperBound;


       public HomePage(){
            PageFactory.initElements(getDriverInstance(), this);
        }

        public void navigateToHomePage(String URL)
        {
            getDriverInstance().get(URL);
            clickButton(we_continueShopping);
         
        }

        public void clickSearchButton()
        {
            clickButton(we_SearchButton);
        }

        public void searchProduct(String productName)
        {
            enterText(we_searchBox,productName);
            clickButton(we_SearchButton);
        }

        public void moveTheSlider(int offSet)
        {
            actionDragDrop(we_priceSliderUpperBound,offSet);
        }
}
