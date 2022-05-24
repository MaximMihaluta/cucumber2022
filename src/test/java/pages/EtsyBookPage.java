package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyBookPage {
    public EtsyBookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@id=\"global-enhancements-search-query\"]")
    public WebElement searchBar;
    @FindBy(xpath = "(//img[@data-listing-card-listing-image])[24]")
    public WebElement book;
}
