package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class googlesteps {

    GooglePage googlePage = new GooglePage();

    @Given("I am at Google homepage")
    public void i_am_at_google_homepage() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("I verify that title is Google")
    public void i_verify_that_title_is_google() {

            String expectedTitle = "Google";
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("I search for dark website")
    public void i_search_for_dark_website() {
        googlePage.searchBox.sendKeys("dark web", Keys.ENTER);

    }

    @Then("I verify the title contains dark web")
    public void i_verify_the_title_contains_dark_web() {

        String expectedTitle = "dark web whiteboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("The Title is not correct",actualTitle.contains(expectedTitle));

    }

}
