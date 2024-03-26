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

import java.time.Duration;

public class Day1Task2 {

    WebDriver driver;

    @When("First step user will enter {string}")
    public void first_step_user_will_enter(String string) {
    driver.findElement(By.id("firstname")).sendKeys(string);

    }
    @When("Second step user will enter {string}")
    public void second_step_user_will_enter(String string) {
        driver.findElement(By.id("surname")).sendKeys(string);

    }
    @When("Third step user will enter {string}")
    public void third_step_user_will_enter(String string) {
        driver.findElement(By.id("age")).sendKeys(string);


    }
    @When("Fourth step user will enter {string}")
    public void fourth_step_user_will_enter(String string) {
        Select select= new Select(driver.findElement(By.id("country")));
        select.selectByVisibleText(string);

    }
    @When("Fifth user will enter {string}")
    public void fifth_user_will_enter(String string) {

        driver.findElement(By.id("notes")).sendKeys(string);

    }
    @When("user will press submit button")
    public void user_will_press_submit_button() {

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Then("Error message will appear")
    public void error_message_will_appear() {
        WebElement errorMessage = driver.findElement(By.xpath("//*[contains(@style,'visibility: visible')]"));
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertTrue(errorMessage.isDisplayed());


    }

    @Given("Open browser")
    public void openDiver() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @And("go to Input Validation Examples page")
    public void inputValidationExamplesPage() {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");

    }

    @And("closes the page")
    public void closesThePage() {
        driver.quit();
    }
}
