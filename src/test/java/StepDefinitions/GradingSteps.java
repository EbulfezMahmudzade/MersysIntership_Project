package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static Utilities.GWD.getDriver;

public class GradingSteps {

    DialogContent dc = new DialogContent();




    @Given("User should be able to click on grading")
    public void userShouldBeAbleToClickOnGrading()
    {
        dc.myClick(dc.Grading);

    }

    @When("The user should be able to click buttons on the grading page")
    public void theUserShouldBeAbleToClickButtonsOnTheGradingPage()
    {
        dc.myClick(dc.StudentTranscripts);
        dc.myClick(dc.TranscriptBySubject);


    }

    @Then("The user should be able to navigate main page")
    public void theUserShouldBeAbleToNavigateMainPage()
    {
        dc.myClick(dc.MainPage);
    }
}
