package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStepDef {
    @Given("the user navigates to the Ebay homepage")
    public void theUserNavigatesToTheEbayHomepage() {

    }

    @When("the user searches for {string}")
    public void theUserSearchesFor(String arg0, String arg1) {
    }

    @Then("the user verifies that the search results contain {string}")
    public void theUserVerifiesThatTheSearchResultsContain(String arg0, String arg1) {
    }

    @When("I close the browser")
    public void iCloseTheBrowser() {
    }
}
