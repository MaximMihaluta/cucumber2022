package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = " //input[@id=\"twotabsearchtextbox\"]")
    public WebElement searchBar;
    @FindBy (xpath = "//input[@id=\"nav-search-submit-button\"]")
    public WebElement searchButton;
    @FindBy(xpath = "(//img[@class=\"s-image\"])[1]")
    public WebElement firstproduct ;
    @FindBy (xpath = "//h1[@id=\"title\"]")
    public WebElement titleOfProduct ;
    @FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
    public WebElement addToCart;
}
