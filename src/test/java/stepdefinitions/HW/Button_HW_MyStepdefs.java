package stepdefinitions.HW;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class Button_HW_MyStepdefs {
    @Given("go to Simple Dynamic Buttons page")
    public void openDiverAndGoToSimpleDynamicButtonsPage() {
        Driver.getDriver().get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }

    @When("Click on {string} Button")
    public void clickOnButton(String string) {
        WebDriverWait wait;
        switch (string){
            case "start":
                Driver.getDriver().findElement(
                        By.id("button00")
                ).click();
                break;
            case "One":
                wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
                WebElement OneButton =Driver.getDriver().findElement(
                        By.id("button01"));
                wait.until(ExpectedConditions.visibilityOf(OneButton));
                OneButton.click();
                break;
            case "Two":
                wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
                WebElement TwoButton =Driver.getDriver().findElement(
                        By.id("button02"));
                wait.until(ExpectedConditions.visibilityOf(TwoButton));
                TwoButton.click();
                break;
            case "Three":
                wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
                WebElement ThreeButton =Driver.getDriver().findElement(
                        By.id("button03"));
                wait.until(ExpectedConditions.visibilityOf(ThreeButton));
                ThreeButton.click();
                break;
            default:

        }
    }


    @Then("verify message will appear")
    public void verifyMessageWillAppear() {
        WebElement verifyMessage =Driver.getDriver().findElement(
                By.id("buttonmessage"));
        Assert.assertTrue(verifyMessage.getText().contains("All Buttons Clicked"));
    }
}
