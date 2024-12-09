package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class TemporaryLoginForFinanceSteps {
    DialogContent dialogContentElement=new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
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
