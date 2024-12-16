package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Us_017Steps {
    DialogContent dc=new DialogContent();

    @Given("Grading is clicked on the hamburger menu")
    public void gradingIsClickedOnTheHamburgerMenu() {
        Assert.assertTrue(dc.Grading.isDisplayed());
        dc.myClick(dc.Grading);

    }

    @When("User clicks rating and print image")
    public void userClicksRatingAndPrintImage() {
        Assert.assertTrue(dc.Print.isDisplayed());
        dc.myClick(dc.Print);
        Assert.assertTrue(dc.pdfbelge.isDisplayed());

    }

    @Then("Downloads the document to the computer")
    public void downloadsTheDocumentToTheComputer() {
        Assert.assertTrue(dc.ındır.isDisplayed());
        dc.myClick(dc.ındır);
    }
}
