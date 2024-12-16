package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    DialogContent dialogContentElement =new DialogContent();
    @Given("Navigate to Campus Website")
    public void navigateToCampusWebSite() {
        GWD.getDriver().get("https://test.mersys.io/");
    }


    @When("The users types username and password and click login button")
    public void theUsersTypesUsernameAndPasswordAndClickLoginButton() {
        dialogContentElement.mySendKeys(dialogContentElement.usernameInput, "Student_9");
        dialogContentElement.mySendKeys(dialogContentElement.passwordInput, "S12345");
        dialogContentElement.myClick(dialogContentElement.loginBtn);
    }

    @Then("The users verifies login successfully")
    public void theUsersVerifiesLoginSuccessfully() {
        dialogContentElement.verifyContainsText(dialogContentElement.loginControl, "Welcome");
    }
}
