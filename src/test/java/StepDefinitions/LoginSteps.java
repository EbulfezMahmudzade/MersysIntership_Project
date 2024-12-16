package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dialogContentElement =new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dialogContentElement.mySendKeys(dialogContentElement.username, "Student_9");
        dialogContentElement.mySendKeys(dialogContentElement.password, "S12345");
        dialogContentElement.myClick(dialogContentElement.loginButton);
    }

    @When("The user types username and password and click login button")
    public void theUserTypesUsernameAndPasswordAndClickLoginButton() {
        dialogContentElement.mySendKeys(dialogContentElement.usernameInput, "Student_9");
        dialogContentElement.mySendKeys(dialogContentElement.passwordInput, "S12345");
        dialogContentElement.myClick(dialogContentElement.loginBtn);
    }

    @Then("The user verifies login successfully")
    public void theUserVerifiesLoginSuccessfully() {
        dialogContentElement.verifyContainsText(dialogContentElement.loginControl, "Welcome");
    }
}
