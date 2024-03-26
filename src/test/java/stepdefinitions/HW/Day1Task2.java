package stepdefinitions.HW;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class Day1Task2 {


    @When("First step user will enter {string}")
    public void first_step_user_will_enter(String string) {
        Driver.getDriver().findElement(By.id("firstname")).sendKeys(string);

    }
    @When("Second step user will enter {string}")
    public void second_step_user_will_enter(String string) {
        Driver.getDriver().findElement(By.id("surname")).sendKeys(string);

    }
    @When("Third step user will enter {string}")
    public void third_step_user_will_enter(String string) {
        Driver.getDriver().findElement(By.id("age")).sendKeys(string);


    }
    @When("Fourth step user will enter {string}")
    public void fourth_step_user_will_enter(String string) {
        Select select= new Select(Driver.getDriver().findElement(By.id("country")));
        select.selectByVisibleText(string);

    }
    @When("Fifth user will enter {string}")
    public void fifth_user_will_enter(String string) {

        Driver.getDriver().findElement(By.id("notes")).sendKeys(string);

    }
    @When("user will press submit button")
    public void user_will_press_submit_button() {

        Driver.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Then("Error message will appear")
    public void error_message_will_appear() {
        WebElement errorMessage = Driver.getDriver().findElement(
                By.xpath("//*[contains(@style,'visibility: visible')]"));
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertTrue(errorMessage.isDisplayed());


    }

    @Given("Open browser")
    public void openDiver() {
        Driver.getDriver();

    }

    @And("go to Input Validation Examples page")
    public void inputValidationExamplesPage() {
        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

    }

    @And("closes the page")
    public void closesThePage() {
        Driver.closeDriver();
    }
}
