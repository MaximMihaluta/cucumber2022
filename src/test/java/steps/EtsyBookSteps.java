package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EtsyBookPage;
import utilities.Driver;

public class EtsyBookSteps {
    EtsyBookPage etsyBookPage = new EtsyBookPage();
    String searchProduct = "Harry Potter";

    @Given("I am on etsy homepage")
    public void i_am_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");

    }
    @When("I search for book")
    public void i_search_for_book() {
        etsyBookPage.searchBar.sendKeys(searchProduct, Keys.ENTER);

    }
    @When("I click on search box")
    public void i_click_on_search_box() {


    }
    @Then("I see the title contains book")
    public void i_see_the_title_contains_book() {
        Assert.assertTrue(etsyBookPage.book.getText().contains(searchProduct));

    }
}
