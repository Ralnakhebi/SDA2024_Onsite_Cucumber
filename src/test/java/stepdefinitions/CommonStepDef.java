package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class CommonStepDef {

    @Given("I open the browser")
    public void i_open_the_browser() {
        Driver.getDriver();

    }
    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("I search for amazon on google")
    public void i_search_for_amazon_on_google() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("amazon", Keys.ENTER);
    }
    @When("I search for {string} on google")
    public void i_search_for_on_google(String string) {
        Driver.getDriver().findElement(By.name("q")).sendKeys(string, Keys.ENTER);
    }
    @Then("I should see amazon on the results")
    public void i_should_see_amazon_on_the_results() {
        Assert.assertFalse(Driver.getDriver()
                .findElements(By.xpath("//*[contains(text(),'amazon')]")).isEmpty());

    }
    @Then("I should see {string} on the results")
    public void i_should_see_on_the_results(String string) {
        Assert.assertFalse(Driver.getDriver()
                .findElements(By.xpath("//*[contains(text(),'"+string+"')]")).isEmpty());
    }

    @Then("close the browser")
    public void close_the_browser() {

    }

    @Then("Test failed")
    public void testFailed() {
        Assert.fail();
    }
}
