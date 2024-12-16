package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileSteps {
    DialogContent dc = new DialogContent();


    @Given("User should be able to click profile setting button")
    public void userShouldBeAbleToClickProfileSettingButton()
    {
        dc.myClick(dc.Kprofile);
        dc.myClick(dc.KsettingButton);


    }

    @When("User should be able to select profile theme")
    public void userShouldBeAbleToSelectProfileTheme()
    {
        dc.myClick(dc.KdefaultTheme);
        wait(ExpectedConditions.visibilityOf(dc.KpurpleTheme));
        dc.myClick(dc.KpurpleTheme);


    }

    private void wait(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }


    @Then("User should be click save button and display success message")
    public void userShouldBeClickSaveButtonAndDisplaySuccessMessage()
    {
     dc.myClick(dc.KsaveButton);
     dc.SuccessMsg();


    }
}
