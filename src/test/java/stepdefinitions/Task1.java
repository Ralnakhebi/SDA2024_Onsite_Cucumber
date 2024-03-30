package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.time.Duration;

public class Task1 {

    @Given("user goes to google page")
    public void user_goes_to_google_page() {

        Driver.getDriver().get("https://www.google.com");
    }
    @When("user searches for {string}")
    public void user_searches_for(String string) {
        Driver.getDriver().findElement(By.name("q")).sendKeys(string, Keys.ENTER);
    }
    @Then("tests the page title contains the word {string}")
    public void tests_the_page_title_contains_the_word(String string) {
     Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

}
